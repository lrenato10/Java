package partie5;

public abstract class Forme extends Object {
	protected abstract double perimetre();
	protected abstract double surface();
	public double etalement() {
		double peri=perimetre();
		return 16*surface()/(peri*peri);
	}
}