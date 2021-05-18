package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfReadFile {
	
	static  String filepath="‪C:\\Users\\91901\\Downloads\\Generic.pdf";
	
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PdfReadFile pdf=new PdfReadFile();
		pdf.readContentFromPdf(filepath);
		
	}
	
	
	public void readContentFromPdf(String filepathforpdf) throws FileNotFoundException
	{
		File file=new File(filepathforpdf);
		FileInputStream fis = new FileInputStream(file);
		
		PDDocument doc = null;
		
		try {
			doc= PDDocument.load(fis);
			String output = new PDFTextStripper().getText(doc);
			System.out.println(output);
			
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		
	}

}
