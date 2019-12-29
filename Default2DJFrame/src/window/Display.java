package window;

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;


import org.joml.Vector2f;

import entities.EntityManager;
import main.Default2DJFrame;

public class Display extends JFrame implements MouseListener, KeyListener, MouseWheelListener {
	
	private static final long serialVersionUID = 1L;

	
	private EntityManager manager;
	
	public Display(EntityManager manager) {
		super("Display");
		this.manager = manager;
		addMouseListener(this);
		addKeyListener(this);
		addMouseWheelListener(this);
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
	}
	


	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	public Vector2f getRelativeMousePosition() {
		PointerInfo a = MouseInfo.getPointerInfo();
		Vector2f mousePos = new Vector2f(a.getLocation().x, a.getLocation().y);
		mousePos.x -= getX() + getContentPane().getX() + 4;
		mousePos.y -= getY() + getContentPane().getY() + 26;
		return mousePos;
	}
	

	
	public void onUpdate() {

	}

	
	
	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
	}

	

}