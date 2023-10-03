package exceptionhandling;

public class invalidException extends Exception {
	private String message;
	
	public invalidException(String message) {
		//super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}
