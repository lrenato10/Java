package partie6;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import java.io.*;

public class Exercice62 {
	public static void main (String[] args) throws IOException {
		
		try {
			//Documents informations
			Document document =new Document();
			document.addAuthor("Luiz");
			document.addCreationDate();
			document.addTitle("Fist Document");
			
			//Create output flow
			FileOutputStream fos = new FileOutputStream("fichier1.pdf");
			//Write documents information in PDF
			PdfWriter.getInstance(document, fos);
			
			//Write PDF content
			document.open();
			document.add(new Paragraph("paragraphe 1"));
			document.add(new Paragraph("paragraphe 2"));
			document.add(new Paragraph("paragraphe 3"));
			document.close();
			}
		catch (FileNotFoundException e) {
			System.out.println("Document does not exist");
			e.printStackTrace();	
		}
		catch (DocumentException de) {
			System.out.println("Document error");
			System.err.println(de.getMessage());
		}
		finally {// pas obligatoire de mettre (execute independent si il y a l' exception)
			System.out.println("End of program");
		}
	}
	
}
