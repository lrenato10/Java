package partie5;

public class Exercice52 {
	public static void main (String[] argv) {
			
		Cercle cer = new Cercle(2);
		Carre car= new Carre(3,4);
		System.out.println("Etalement Cercle: " + cer.etalement());
		System.out.println("Etalement Carre: " + car.etalement());
	}
}
