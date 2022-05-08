package partie5;

public class Carre extends Forme {
	private int x;
	private int y;
	
	public Carre(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	protected double perimetre() {
		// TODO Auto-generated method stub
		return 2*(x+y);
	}

	@Override
	protected double surface() {
		// TODO Auto-generated method stub
		return x*y;
	}

}
