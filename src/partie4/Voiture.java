package partie4;

//importe package
import java.util.ArrayList;
import java.util.Date;

public class Voiture {
	// =============================Classe=========================================
	// variables de classe (STATIC)
	private static int nbVoitures;
	private static Voiture listeVoitures[] = new Voiture[10];// liste statique
	private static ArrayList<Voiture> listeVoitures2 = new ArrayList<Voiture>();// liste dynamique
	// methode de classe (STATIC)

	public static int getNbVoiture() {
		return nbVoitures;
	}

	public static Voiture[] listeVoitures() {
		return listeVoitures;
	}

	public static ArrayList<Voiture> getListeVoitures2() {
		return listeVoitures2;
	}

	// ============================Instances========================================
	private int puissance;
	private double vitesse;
	private boolean estDemarre;
	private String nom;
	private Date dateCreation = new Date(100, 0, 1);

	public Voiture() {// constructeur
		puissance = 0;
		vitesse = 0;
		estDemarre = false;
		listeVoitures[nbVoitures] = this;
		listeVoitures2.add(this);
		nbVoitures++;

	}

	public Voiture(int pui, int vi, boolean estD) {// constructeur
		puissance = pui;
		vitesse = vi;
		estDemarre = estD;
		listeVoitures[nbVoitures] = this;
		listeVoitures2.add(this);
		nbVoitures++;

	}
	
	public Voiture(int vi) {// constructeur
		puissance = 40;
		vitesse = vi;
		estDemarre = false;
		listeVoitures[nbVoitures] = this;
		listeVoitures2.add(this);
		nbVoitures++;

	}

	public void affiche() {
		System.out.println("vitesse = " + vitesse);
		System.out.println("puissance = " + puissance);
		System.out.println("Demarre = " + estDemarre);
	}
	
	public void afficheDate() {
		System.out.println(dateCreation.toString());
	}

	public boolean sidemarre() {
		return estDemarre;
	}

	public void demarre() {
		estDemarre = true;
	}

	public void demarre(int vi) {// overloading/surcharge
		estDemarre = true;
		vitesse = vi;
	}

	public double getSpeed() {
		return vitesse;
	}

	public void setSpeed(double vi) {
		vitesse = vi;
	}

	public int getPower() {
		return puissance;
	}

	public void setPower(int pu) {
		puissance = pu;
	}

	public String getnom() {
		return nom;
	}

	public void setnom(String nom_) {
		nom = nom_;
	}

	public void accelere() {
		vitesse = vitesse + 5;
	}
	
	public void accelere(int inc) {
		vitesse = vitesse + inc;
	}
}
