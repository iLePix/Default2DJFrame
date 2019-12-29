package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JLabel;

import org.joml.Vector2f;

import entities.Entity;
import entities.EntityManager;
import entities.TexturedEntity;
import main.Default2DJFrame;
import window.Display;

public class Renderer2D extends JLabel {
	private static final long serialVersionUID = 1L;

	public static final int VIEW_MAIN_MENU = 0;
	public static final int VIEW_EDITOR = 1;

	public int sizeX, sizeY;

	private EntityManager entityManager;
	private Display display;

	private BufferedImage background = ImageLoader.getImage("placeholder");

	

	
	public Renderer2D(int sizeX, int sizeY, EntityManager entityManager, Display display) {
		super("Renderer label");
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.entityManager = entityManager;
		this.display = display;
	}

	@Override
	public void paint(Graphics g) {
		render(g);	
	}

	public void render(Graphics g) {

		g.drawImage(background, 0, 0, display.getWidth(), display.getHeight(), null);

		List<TexturedEntity> allEntities = entityManager.getAllEntities();
		allEntities.forEach((entity) -> {
			
			g.setColor(Color.WHITE);
			g.drawImage(entity.getImage(), (int) (entity.position.x), (int) (entity.position.y),
					(int) (entity.size.x), (int) (entity.size.y), null);

		});
		


	}
}
