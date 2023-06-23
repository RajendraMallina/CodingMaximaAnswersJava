package c14_exceptions;

public class LongNameException extends RuntimeException{

	private String message = "";
	
	public LongNameException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LongNameException [message=" + message + "]";
	}
	
	
}
