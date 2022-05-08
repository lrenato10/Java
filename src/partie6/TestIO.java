package partie6;
 
import java.io.*;

public class TestIO {	
	public static void main(String[] argv) throws IOException{
		String name="To_Write1.txt";
		
		try {
			
			if (name=="") throw new IOException();
			
			FileWriter myFile = new FileWriter(name);
			myFile.write("First line of this document");
			myFile.close();
		}
		catch (IOException e) {
			System.out.println("Empty name");//message a envoyer
			e.printStackTrace();// montre les ligne d' origine du erreur
			System.exit(-1); //end program
		}
		finally {// pas obligatoire de mettre (execute independent si il y a l' exception)
			System.out.println("Fin du programme");
		}
	}
	
	
}
