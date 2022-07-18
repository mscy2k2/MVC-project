import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class DividendController {
	
	private DividendView theView;
	private DividendModel theModel;
	
	public DividendController(DividendView theView, DividendModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the dividend button
		// is clicked to execute the actionPerformed method
		// in the Listener inner class
		
		this.theView.addDividendListener(new DividendListener());
	}
	
	class DividendListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int amount, year = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				amount = theView.getAmount();
				year = theView.getYear();
				
				theModel.calcDividend(amount, year);
				
				theView.setDividendSolution(theModel.getDividendValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
}