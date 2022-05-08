package partie3;

public class Exercice34 {
	public static void main (String[] argv) {
		Voiture34 voiture1 = new Voiture34(40,35,false);//Declaration et Creation
		Voiture34 voiture2 = new Voiture34(20,20,false);//Declaration et Creation
		voiture1.setnom("Sandero");
		voiture2.setnom("208");
		
		System.out.println("Nombre voitures: " + Voiture34.getNbVoiture());
		
		for (int i=0; i< Voiture34.getNbVoiture(); i++) {
			System.out.println(Voiture34.listeVoitures()[i].getnom());
		}
		
		for(int i = 0; i < Voiture34.getListeVoitures2().size(); i++) {
			System.out.println(Voiture34.getListeVoitures2().get(i).getnom());
		}
		
	}
}