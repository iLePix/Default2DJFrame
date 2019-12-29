package entities;

import java.awt.Rectangle;

import org.joml.Vector2f;
import org.joml.Vector2i;

public class Entity {

	public Vector2f position;
	public Vector2i size;
	
	public Entity() {
		
	}
	
	public Entity(Vector2f position, Vector2i size) {
		this.position = position;
		this.size = size;		
	}
	
	
	public boolean collidesWith(Entity e) {
		Rectangle thisCollision = new Rectangle( (int) position.x, (int) position.y, size.x, size.y);
		Rectangle otherCollision = new Rectangle( (int) e.position.x, (int) e.position.y, e.size.x, e.size.y);
		return thisCollision.intersects(otherCollision);
	}
	
	public boolean collidesWith(Rectangle r) {
		Rectangle thisCollision = new Rectangle( (int) position.x, (int) position.y, size.x, size.y);
		return thisCollision.intersects(r);
	}
	
	public void update() {}
	
}