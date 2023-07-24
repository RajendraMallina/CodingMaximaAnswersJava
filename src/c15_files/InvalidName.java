package c15_files;

public class InvalidName extends RuntimeException{

	private String message;
	
	public InvalidName(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidName [message=" + message + "]";
	}
	
	
}
