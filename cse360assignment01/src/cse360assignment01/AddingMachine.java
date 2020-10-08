package cse360assignment01;

public class AddingMachine {
	private int total;
	private String txHistory = "0";
	  
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	  
	public int getTotal () { // returns current total
	    return total;
	}
	  
	public void add (int value) { // add an integer to the total
		txHistory += (" + " + value); // record transaction
		total += value;
	}

	public void subtract (int value) { // remove an integer to the total
		txHistory += (" - " + value); //  record transaction
		total -= value;
	}

	public String toString () { // return transaction history
		return txHistory;
	}

	public void clear() { // reset the total value
		total = 0;
		txHistory = "";
	}
}