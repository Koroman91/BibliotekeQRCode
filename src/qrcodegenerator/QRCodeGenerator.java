package qrcodegenerator;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import javafx.application.Application;


import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.lang.*;

public class QRCodeGenerator {
	
	public static void main(String[] args) throws Exception
	{
		String details = "Stefan Korolija : Vezba Java : QRGenerator......";
		
		
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		
	
		File f = new File("C:\\Users\\Stefan-Ivan\\Desktop\\Libs\\Stefan.jpg");
		
	
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();
		}

	}


