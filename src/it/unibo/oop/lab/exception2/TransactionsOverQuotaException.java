package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalStateException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 380919217883973559L;

	public String toString() {
		return "No more transaction available";
	}
	
	public String getMessage() {
		return toString();
	}

}
