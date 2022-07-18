// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DividendView extends JFrame{

	private JTextField amount  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField year = new JTextField(10);
	private JButton dividendButton = new JButton("Dividend($)");
	private JTextField dividendSolution = new JTextField(10);
	private JLabel lblAmount = new JLabel("Amount($)");
	private JLabel lblYear = new JLabel("Year(s)");
	private JButton resetButton = new JButton("Reset");
	
	DividendView(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(lblAmount);
		
		calcPanel.add(amount);
		calcPanel.add(additionLabel);
		
		calcPanel.add(lblYear);
		calcPanel.add(year);
		calcPanel.add(dividendButton);
		calcPanel.add(dividendSolution);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				amount.setText(null);
				year.setText(null);
				dividendSolution.setText(null);
			}
		});
		calcPanel.add(resetButton);
		
		getContentPane().add(calcPanel);
		
		// End of setting up the components --------
		
	}
	
	public int getAmount(){
		
		return Integer.parseInt(amount.getText());
		
	}
	
	public int getYear(){
		
		return Integer.parseInt(year.getText());
		
	}
	
	public int getDividendSolution(){
		
		return Integer.parseInt(dividendSolution.getText());
		
	}
	
	public void setDividendSolution(int solution){
		
		dividendSolution.setText(Integer.toString(solution));
		
	}
	
	// If the dividendButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addDividendListener(ActionListener listenForDividendButton){
		
		dividendButton.addActionListener(listenForDividendButton);
		
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}

