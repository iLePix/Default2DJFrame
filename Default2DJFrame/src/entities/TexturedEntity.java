package entities;

import java.awt.image.BufferedImage;

import org.joml.Vector2f;
import org.joml.Vector2i;

import graphics.ImageLoader;

public class TexturedEntity extends Entity {
	
	transient protected BufferedImage image;
	
	
	private String imageString;
	
	//used for serialization
	public TexturedEntity() {
		
	}
	
	//post serialization
	public void setup() {
		this.image = ImageLoader.getImage(imageString);
	}
	
	public TexturedEntity(Vector2f position, Vector2i size, String image) {
		super(position, size);
		this.image = ImageLoader.getImage(image);
		imageString = image;
	}
	
	
	public BufferedImage getImage() {
		return image;
	}
	
	public String getImageString() {
		return imageString;
	}
}