package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException {
	private static final long serialVersionUID = 7286169411703220340L;

	public String toString() {
		return "Wrong Account";
	}
	
	public String getMessage() {
		return toString();
	}
}
