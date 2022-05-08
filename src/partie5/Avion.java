package partie5;

import java.util.ArrayList;

public class Avion extends Object {
	private double puissance;
	private double vitesse;

	public Avion() {// constructeur
		puissance = 0;
		vitesse = 0;
	}

	public Avion(int pui, int vi) {// constructeur
		puissance = pui;
		vitesse = vi;
	}
	
	
	public boolean equals(Object o) {
		boolean r=false;
		if (o instanceof Avion==false)
			r=false;
		
		if (o instanceof Avion==true) {
			if (this.puissance==((Avion)o).puissance && this.vitesse==((Avion)o).vitesse)
				r=true;
			else 
				r=false;
		}
		
		return r;
		
	}
	
}