package initiationJava;

public class Exercice21 {
	public static void afficheTableau(int[] tab) {
		for (int current: tab) {
			System.out.println(current);
		}
	
	}
	public static void main (String[] argv) { // main
		//short
		short monTableau[];//declaration
		monTableau=new short[5];//dimensionnement
		
		for (int i=0; i< monTableau.length; i++) {
			monTableau[i]=(short)(i*2);
		}
		
		for (short current: monTableau) {
			System.out.println(current);
		}
		
		//int
		int monTableauInt[];//declaration
		monTableauInt=new int[5];//dimensionnement
		for (int i=0; i< monTableauInt.length; i++) {
			monTableauInt[i]=i*3;
		}
		afficheTableau(monTableauInt);
		
	}
}