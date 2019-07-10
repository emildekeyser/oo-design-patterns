package view;

public class ViewException extends Exception {
	private static final long serialVersionUID = 1L;

	public ViewException() {
		super();
	}

	public ViewException(String message, Throwable exception) {
		super(message, exception);
	}

	public ViewException(String message) {
		super(message);
	}

	public ViewException(Throwable exception) {
		super(exception);
	}

}
