package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8454232870128290588L;
	
	public String toString() {
        return "Can not move. Battery empty";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }


	
	 
}
