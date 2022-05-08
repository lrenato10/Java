package partie5;

public class Exercice51 {
	public static void main (String[] argv) {
			
		Avion Av1 = new Avion(13,20);
		Avion Av2 = new AvionElectrique(13,20);
		Avion Av3 = new Avion(36,44);
		System.out.println("Av1.equals(Av2): " + Av1.equals(Av2));
		System.out.println("Av1.equals(Av3): " + Av1.equals(Av3));
	}
}
