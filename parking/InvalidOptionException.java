package parking;

/**
 * 
 * @author savant
 * 
 * Handles exception when user gives invalid choice.
 *
 */
class InvalidOptionException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public InvalidOptionException(String str) {
		super(str);
	}
}