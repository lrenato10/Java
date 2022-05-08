package partie3;

public class Voiture {
	public int puissance;
	public int vitesse;
	public boolean estDemarre;

	public Voiture() {//constructeur
		puissance=0;
		vitesse=0;
		estDemarre=false;
		
	}
	
	public Voiture(int pui, int vi, boolean estD) {//constructeur
		puissance=pui;
		vitesse=vi;
		estDemarre=estD;
		
	}
}
