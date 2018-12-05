import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Main {

	public static void main(String[] args) {
		word2pdf();
		
	}

	private static void word2pdf() {
		try {
			System.out.println("Procesando");

			File inFile = new File("/Users/alanramirez/Downloads/bla2.docx");
			File outFile = new File("/Users/alanramirez/Downloads/Test.pdf");

			InputStream in = new FileInputStream(inFile);
			OutputStream out = new FileOutputStream(outFile);

			XWPFDocument document = new XWPFDocument(in);
			PdfOptions options = PdfOptions.create();
			PdfConverter.getInstance().convert(document, out, options);

			System.out.println("Terminado");
		} catch (Exception e) {
			System.out.println("Algo salio mal");
			e.printStackTrace();
		}
	}
	
	
}
