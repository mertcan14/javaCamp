package lecture5homework1.core.utilities.results;

public class ErrorResult extends Result{

	public ErrorResult() {
		super(false);
	}
	public ErrorResult(String message) {
		super(message,false);
	}

}
