package sg.edu.nus.comp.cs4218.exception;

public class BcException extends AbstractApplicationException {

	private static final long serialVersionUID = 6281413815403297986L;

	public BcException(String message) {
		super("bc: " + message);
	}
}