package partie5;

public class Cercle extends Forme {
	private int r;
	
	public Cercle (int r) {
		this.r=r;
	}
	
	@Override
	protected double perimetre() {
		// TODO Auto-generated method stub
		return 2*3.14*r;
	}

	@Override
	protected double surface() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

}
