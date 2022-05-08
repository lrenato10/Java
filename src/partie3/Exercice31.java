package partie3;

public class Exercice31 {
	public static void main (String[] argv) {
		Voiture Car1 = new Voiture();//Declaration et Création
		//Voiture Car;//Declaration
		//Car= new Voiture();//Création
		Car1.puissance=100;
		Car1.vitesse=50;
		Car1.estDemarre=true;
		System.out.println(Car1.vitesse);//printf
		
		Voiture Car2 = new Voiture(60,30, true);
		System.out.println(Car2.vitesse);//printf
		//Voiture Car;//Declaration
		//Car= new Voiture();//Création

	}
}