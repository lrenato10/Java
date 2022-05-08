package partie6;

public class Point {
	public int x; int y;
	
	//==================== Methodes avec Exception============================================
	public Point(int x, int y) throws ErrConst{
		if ((x<0) || (x<0)) throw new ErrConst("Erreur Construction");//cree le objet exception
		this.x=x; this.y=y;
	}
	
	public void deplace(int dx, int dy) throws ErrDepl {
		if (((x+dx) < 0) || ((y+dy) <0)) throw new ErrDepl("Deplace negatif");
		x += dx ; y +=dy;
	}
	//========================================================================================
	
	public void affiche(){
		System.out.println("Coordonees: " + "x:" + x + "y:" + y);
	}
	public int getX() {
		return this.x;
		}
	public int getY() {
		return this.y;
		}
}
