package partie6;

import partie4.Voiture;//import classe Voiture du package4

public class Exercice61 {
	public static void main (String[] argv) {
		Voiture V1 = new Voiture(30);
		System.out.println("Speed: " + V1.getSpeed());
		V1.afficheDate();
	}
}
