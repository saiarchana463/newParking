package parking;

/**
 * @author savant
 * 	Handles exception raised by validation
 *
 */
class ValidateException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ValidateException(String str) {
		super(str);
	}
}