package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfExtract {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PDDocument pd;
		pd = PDDocument.load(new File("C://Users//91901//Downloads//Generic.pdf"));
		
		System.out.println(pd.getNumberOfPages());
		
		PDFTextStripper pdf = new PDFTextStripper();
		System.out.println(pdf.getText(pd));
		
		

	}

}
