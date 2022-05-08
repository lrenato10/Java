package partie6;

//test point
public class Exercice63 {
	public static void main (String [] argv) {
		try {
			Point a =  new Point (-1, 4); //Exception ErrConst
			a.affiche();
			Point b =  new Point (1, 1);
			b.deplace(-2,1); //Exception ErrDepl
			b.affiche();
		} 
		catch (ErrConst e) {
			System.out.println(e.getMessage());//message informe dans le throw en Point
			e.printStackTrace();// montre les ligne d' origine du erreur
			System.exit(-1); //end program
		}
		catch (ErrDepl e) {
			System.out.println(e.getMessage());//message informe dans le throw en Point
			e.printStackTrace();// montre les ligne d' origine du erreur
			System.exit(-1);
		}
		finally {// pas obligatoire de mettre (execute independent si il y a l' exception)
			System.out.println("Fin du programme");
		}
	}
}
