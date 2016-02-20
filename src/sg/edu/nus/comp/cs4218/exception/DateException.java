package sg.edu.nus.comp.cs4218.exception;

public class DateException extends AbstractApplicationException {
	
	private static final long serialVersionUID = 7329821742813386246L;

	public DateException(String message) {
		super("date: " + message);
	}
}
