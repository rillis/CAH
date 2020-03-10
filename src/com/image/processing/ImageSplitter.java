package com.image.processing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageSplitter {
	
	public static void main(String[] args) {
		try {
			splitImgs();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void splitImgs() throws IOException {
		
		
		for (int i = 0; i < 457; i++) {
			
			BufferedImage source = ImageIO.read(new File(Cards.preffix2+"carta_"+i+".png"));
			
			ImageIO.write(source.getSubimage(3, 3, 390, 390), "png", new File(Cards.preffix2+"carta"+"_"+i+".png"));
			
		}
		
		for (int i = 0; i < 91; i++) {
			
			BufferedImage source = ImageIO.read(new File(Cards.preffix2+"cartablack_"+i+".png"));
			
			ImageIO.write(source.getSubimage(3, 3, 390, 390), "png", new File(Cards.preffix2+"cartablack"+"_"+i+".png"));
			
		}
		    
		
	}
}
