package partie4;

public class VehiculePrioritaire extends Voiture {
	private boolean gyrophare;
	
	public VehiculePrioritaire(){
		super();//appelle le constructeur de la classe mere Voiture
	}
	public VehiculePrioritaire(int vi){
		super(vi);//appelle le constructeur de la classe mere Voiture
	}
	
	public void allumeGyrophare() {
		gyrophare=true;
		super.accelere(10);//utilise de methode accelere de la classe mere/super classe
	} 
}