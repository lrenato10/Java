package partie6;

public class ErrDepl extends Exception {
	private String message;
	
	public ErrDepl() {
		super();
	}
	public ErrDepl(String message) {
		super();
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
