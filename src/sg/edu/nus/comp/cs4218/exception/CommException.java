package sg.edu.nus.comp.cs4218.exception;

public class CommException extends AbstractApplicationException {
	
	private static final long serialVersionUID = -7082514860192059501L;

	public CommException(String message) {
		super("comm: " + message);
	}
}
