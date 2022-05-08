package partie6;
 
import java.io.*;

public class TestIO3 {	
	public static void main(String[] argv) throws IOException{
		FileReader in;
		FileWriter out;
		
		try {
			
			in = new FileReader("To_Read3.txt");
			//in = new FileReader("To_Read3_Test.txt");//test exception
			out = new FileWriter("To_Write3.txt");
			
			int c; 
			
			while ((c=in.read())!= -1) {
				out.write(c);
			}
			
			in.close();
			out.close();
			
		}
		catch (IOException e) {
			System.out.println("File to read doesn't exist");//message a envoyer
			e.printStackTrace();// montre les ligne d' origine du erreur
			System.exit(-1); //end program
		}
		finally {// pas obligatoire de mettre (execute independent si il y a l' exception)
			System.out.println("Fin du programme");
		}
	}
	
	
}
