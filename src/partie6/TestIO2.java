package partie6;
 
import java.io.*;

public class TestIO2 {	
	public static void main(String[] argv) throws Exception{
		System.out.print("Write your name :");
		String inputLine= " ";
		
		try {
			BufferedReader is = new BufferedReader (new InputStreamReader(System.in)); //read from keyboard
			inputLine= is.readLine();
			is.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());//message a envoyer
			e.printStackTrace();// montre les ligne d' origine du erreur
			System.exit(-1); //end program
		}
		if(inputLine != null) {
			System.out.println("Your name is: " + inputLine);//message a envoyer
		}

	}
	
	
}
