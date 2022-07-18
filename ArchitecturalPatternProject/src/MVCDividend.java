
public class MVCDividend {
	
public static void main(String[] args) {
    	
    	DividendView theView = new DividendView();
        
    	DividendModel theModel = new DividendModel();
        
        DividendController theController = new DividendController(theView,theModel);
        
        theView.setVisible(true);
        
    }

}
