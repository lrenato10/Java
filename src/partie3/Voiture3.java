package partie3;

public class Voiture3 {
	private int puissance;
	private int vitesse;
	private boolean estDemarre;

	public Voiture3() {//constructeur
		puissance=0;
		vitesse=0;
		estDemarre=false;
		
	}
	
	public Voiture3(int pui, int vi, boolean estD) {//constructeur
		puissance=pui;
		vitesse=vi;
		estDemarre=estD;
		
	}
	
	public void affiche() {
		System.out.println("vitesse = " + vitesse);
		System.out.println("puissance = " + puissance);
		System.out.println("Demarre = " + estDemarre);
	}
	
	public boolean sidemarre() {
		return estDemarre;
	}
	
	public void demarre() {
		estDemarre=true;
	}
	public void demarre(int vi) {// overloading/surcharge
		estDemarre=true;
		vitesse=vi;
	}
	
	public int getSpeed() {
		return vitesse;
	}
	public void setSpeed(int vi) {
		vitesse=vi;
	}
	public int getPower() {
		return puissance;
	}
	public void setPower(int pu) {
		puissance=pu;
	}
}
