package partie3;

public class Exercice33 {
	public static void main (String[] argv) {
		Voiture3 voiture1 = new Voiture3(40,35,false);//Declaration et Création
		Voiture3 voiture2 = new Voiture3(20,20,false);//Declaration et Création
		
		//surcharge
		voiture1.demarre();
		voiture2.demarre(44);
		
		voiture1.affiche();
		voiture2.affiche();
		
		System.out.println(voiture1);
		System.out.println(voiture2);
		
		//suprimer voiture 1
		voiture1=null;//ne sert plus a rien
		System.gc();// call carbage collector
		
	}
}