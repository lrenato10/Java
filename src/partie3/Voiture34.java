package partie3;
import java.util.ArrayList;

public class Voiture34 {
	//=============================Classe=========================================
	//variables de classe (STATIC)
	private static int nbVoitures;
	private static Voiture34 listeVoitures[]= new Voiture34[10];//liste statique
	private static ArrayList<Voiture34> listeVoitures2 = new ArrayList<Voiture34>();//liste dynamique
	//methode de classe (STATIC)
	public static int getNbVoiture() {
		return nbVoitures;
	}
	public static  Voiture34[] listeVoitures() {
		return listeVoitures;
	}
	public static ArrayList<Voiture34> getListeVoitures2() {
		return listeVoitures2;
	}
	
	//============================Instances========================================
	private int puissance;
	private int vitesse;
	private boolean estDemarre;
	private String nom;
	
	
	public Voiture34() {//constructeur
		puissance=0;
		vitesse=0;
		estDemarre=false;
		listeVoitures[nbVoitures]=this;
		listeVoitures2.add(this);
		nbVoitures++;
		
	}
	
	public Voiture34(int pui, int vi, boolean estD) {//constructeur
		puissance=pui;
		vitesse=vi;
		estDemarre=estD;
		listeVoitures[nbVoitures]=this;
		listeVoitures2.add(this);
		nbVoitures++;
		
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
	public String getnom() {
		return nom;
	}
	public void setnom(String nom_) {
		nom=nom_;
	}
}
