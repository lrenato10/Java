package partie7;
//importe package
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * This class <code>Voiture</code> is a class of a generic car with many attributes and methods
 * 
 * This class <code>Voiture</code> has five <b>private</b> attributes:
 * <ul>
 * <li>puissance</li>
 * <li>vitesse</li>
 * <li>estDemarre</li>
 * <li>nom</li>
 * <li>dateCreation</li>
 * </ul>
 * 
 * This class <code>Voiture</code> has three <b>private static</b> attributes:
 * <ul>
 * <li>nbVoitures</li>
 * <li>listeVoitures</li>
 * <li>listeVoitures2</li>
 * </ul>
 *  
 * @author Luiz Renato RODRIGUES CARNEIRO
 * @version 5.0
 * 
 */

public class Voiture {
	// =============================Classe (STATIC)=========================================
	// variables de classe (STATIC)
	private static int nbVoitures;
	private static Voiture listeVoitures[] = new Voiture[10];// liste statique
	private static ArrayList<Voiture> listeVoitures2 = new ArrayList<Voiture>();// liste dynamique
	// methode de classe (STATIC)

	/**
	 * Show the total number of instantiated cars
	 * @return nbVoitures (number of cars)
	 * @since 4.0 
	 */
	public static int getNbVoiture() {
		return nbVoitures;
	}
	
	/**
	 * Get the vector of cars
	 * @return listeVoitures (vector of cars)
	 * @since 4.0 
	 */
	public static Voiture[] listeVoitures() {
		return listeVoitures;
	}
	
	/**
	 * Get the ArrayList of cars
	 * @return listeVoitures2 (ArrayList of cars)
	 * @see ArrayList
	 * @since 4.0  
	 */
	public static ArrayList<Voiture> getListeVoitures2() {
		return listeVoitures2;
	}

	// ============================Instances========================================
	private int puissance;
	private double vitesse;
	private boolean estDemarre;
	private String nom;
	/**
	 * @deprecated As of JDK version 1.1,replaced by Calendar.set(year + 1900, month, date) or GregorianCalendar(year + 1900, month, date).
	 */
	private Date dateCreation = new Date(100, 0, 1);

	/**
	 * Constructor without parameters
	 * @since 4.0
	 */
	public Voiture() {
		puissance = 0;
		vitesse = 0;
		estDemarre = false;
		listeVoitures[nbVoitures] = this;
		listeVoitures2.add(this);
		nbVoitures++;

	}
	
	/**
	 * Constructor with three parameters
	 * @param pui (power)
	 * @param vi (speed)
	 * @param estD (is started)
	 * @since 4.0
	 */
	public Voiture(int pui, int vi, boolean estD) {
		puissance = pui;
		vitesse = vi;
		estDemarre = estD;
		listeVoitures[nbVoitures] = this;
		listeVoitures2.add(this);
		nbVoitures++;

	}
	
	/**
	 * Constructor with one parameters
	 * @param vi (speed)
	 * @since 4.0
	 */
	public Voiture(int vi) {
		puissance = 40;
		vitesse = vi;
		estDemarre = false;
		listeVoitures[nbVoitures] = this;
		listeVoitures2.add(this);
		nbVoitures++;

	}

	/**
	 * show speed, power and start status
	 * @since 2.0
	 */
	public void affiche() {
		System.out.println("vitesse = " + vitesse);
		System.out.println("puissance = " + puissance);
		System.out.println("Demarre = " + estDemarre);
	}
	
	/**
	 * show date of creation
	 * @since 5.0
	 * @deprecated As of JDK version 1.1,replaced by Calendar.set(year + 1900, month, date) or GregorianCalendar(year + 1900, month, date).
	 */
	public void afficheDate() {
		System.out.println(dateCreation.toString());
	}

	/**
	 * If is started
	 * @return estDemarre (start status)
	 * @since 2.0
	 */
	public boolean sidemarre() {
		return estDemarre;
	}
	
	/**
	 * Start the engine
	 * @since 2.0
	 */
	public void demarre() {
		estDemarre = true;
	}
	
	/**
	 * Start the engine and set speed
	 * @see Voiture#demarre()
	 * @see Voiture#setSpeed(double)
	 * @param vi (speed)
	 * @since 2.0
	 */
	public void demarre(int vi) {// overloading/surcharge
		this.demarre();
		this.setSpeed(vi);
	}

	/**
	 * Get Speed
	 * @return vitesse (speed)
	 * @since 2.0
	 */
	public double getSpeed() {
		return vitesse;
	}

	/**
	 * Set Speed
	 * @param vi (speed)
	 * @since 2.0
	 */
	public void setSpeed(double vi) {
		vitesse = vi;
	}

	/**
	 * Get Power
	 * @return puissance (power)
	 * @since 2.0
	 */
	public int getPower() {
		return puissance;
	}

	/**
	 * Set Power
	 * @param pu (power)
	 * @since 2.0
	 */
	public void setPower(int pu) {
		puissance = pu;
	}

	/**
	 * Get Name
	 * @return nom (car name)
	 * @since 2.0
	 */
	public String getnom() {
		return nom;
	}

	/**
	 * Set Name
	 * @param nom_ (name)
	 * @since 2.0
	 */
	public void setnom(String nom_) {
		nom = nom_;
	}

	/**
	 * Accelerate (increase speed in +5)
	 * @since 2.0
	 */
	public void accelere() {
		vitesse = vitesse + 5;
	}
	
	/**
	 * Accelerate (increase speed in +inc)
	 * @param inc (value to increase the speed)
	 * @since 2.0
	 */
	public void accelere(int inc) {
		vitesse = vitesse + inc;
	}
}
