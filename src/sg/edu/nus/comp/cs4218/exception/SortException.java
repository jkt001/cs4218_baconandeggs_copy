package sg.edu.nus.comp.cs4218.exception;

public class SortException extends AbstractApplicationException {

	private static final long serialVersionUID = 220119950118007L;

	public SortException(String message) {
		super("sort: " + message);
	}
}
