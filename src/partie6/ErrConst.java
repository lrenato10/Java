package partie6;

public class ErrConst extends Exception {
	private String message;
	
	public ErrConst() {
		super();
	}
	public ErrConst(String message) {
		super();
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
