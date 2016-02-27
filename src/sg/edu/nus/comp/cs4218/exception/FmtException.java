package sg.edu.nus.comp.cs4218.exception;

public class FmtException extends AbstractApplicationException {

	private static final long serialVersionUID = 8853150408431027188L;
	
	public FmtException(String message) {
		super("fmt:" + message);
	}

}
