package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2110957397186048011L;

	public String toString() {
		return "Not enough money"; 
	}
	
	public String getMessage() {
		return toString();
	}

}
