package partie4;

public class Exercice41 {
	public static void main (String[] argv) {
		
		Voiture voiture1 = new Voiture(35);//Declaration et Creation avec argument vitesse
		Voiture voiture2 = new Voiture(20);//Declaration et Creation avec argument vitesse
		voiture1.setnom("Sandero");
		voiture2.setnom("208");
		
		VehiculePrioritaire vehiculePrioritaire1 = new VehiculePrioritaire(30);
		vehiculePrioritaire1.allumeGyrophare(); //accelere deja 10
		vehiculePrioritaire1.accelere(40);
		
		System.out.println("Nombre voitures: " + Voiture.getNbVoiture());
		System.out.println(vehiculePrioritaire1.getSpeed());//30+10+40=80
		
		
	}
}