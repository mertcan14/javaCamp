package lecture5homework1.core.utilities.results;

public class Result implements ResultService{
	private String message;
	private boolean success;
	
	public Result(String message, boolean success) {
		this.message=message;
		this.success=success;
	}
	public Result(boolean success) {
		this.success=success;
	}
	
	public String getMessage() {
		return message;
	}
	public boolean getSuccess() {
		return success;
	}
	
}
