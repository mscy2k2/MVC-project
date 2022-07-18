// The Model performs all the calculations needed
// and that is it. It doesn't know the View 
// exists

public class DividendModel {

	// Holds the value of the sum of the numbers
	// entered in the view

	private int dividendValue;

	public void calcDividend(int amount, int year) {

		dividendValue = (int) ((0.1 * year * amount) + amount);

	}

	public int getDividendValue() {

		return dividendValue;

	}

}
