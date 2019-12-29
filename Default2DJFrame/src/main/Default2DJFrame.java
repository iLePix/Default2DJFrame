package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.joml.Vector2f;
import org.joml.Vector2i;

import entities.EntityManager;
import entities.TexturedEntity;
import graphics.Renderer2D;
import window.Display;

public class Default2DJFrame {
	
	public static Timer mainTimer;

	
	public static final int TIME_STEP = 1000 / 60;

	private static Vector2f mousePos;
	private static Display display;
	private static Renderer2D renderer;
	public static Vector2f movingCursorOffset = new Vector2f(0, 0);
	public static EntityManager manager = new EntityManager();
	
	public static void main(String[] args) {
	
		
		//CustomCursor.initialize();
		display = new Display(manager);
		renderer = new Renderer2D(1000, 800, manager, display);

		display.add(renderer);
		display.setVisible(true);
		
		
		manager.addEntity(new TexturedEntity(new Vector2f(100, 100),new Vector2i(100, 100), "placeholder"));
		
		
		mainTimer = new Timer();
		mainTimer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				mousePos = display.getRelativeMousePosition();
		

				
				manager.update();
				renderer.repaint();
				display.onUpdate();
			}
		}, TIME_STEP, TIME_STEP);
	}
}