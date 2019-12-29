package graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class ImageLoader {

	public static final String IMAGE_PATH = "./res/images/";
	
	private static HashMap<String, BufferedImage> loaded = new HashMap<>();
	
	public static BufferedImage getImage(String name) {
		if(loaded.containsKey(name))
			return loaded.get(name);
		BufferedImage image;
		try {
			image = ImageIO.read(new File(IMAGE_PATH + name + ".png"));
			loaded.put(name, image);
			return image;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("ImageLoader failed to load an image!");
		return null;
	}
	
}
