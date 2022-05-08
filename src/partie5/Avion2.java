package partie5;

import java.util.ArrayList;

public class Avion2 extends Object {
	private double puissance;
	private double vitesse;

	public Avion2() {// constructeur
		puissance = 0;
		vitesse = 0;
	}

	public Avion2(int pui, int vi) {// constructeur
		puissance = pui;
		vitesse = vi;
	}
	
	
	public boolean equals(Object o) {
		boolean r=false;
		if (o instanceof Forme==false)
			r=false;
		
		if (o instanceof Forme==true) {
			if (this.puissance==((Forme)o).puissance && this.vitesse==((Forme)o).vitesse)
				r=true;
			else 
				r=false;
		}
		
		return r;
		
	}
	
}