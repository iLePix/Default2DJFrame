package entities;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import org.joml.Vector2f;



public class EntityManager {
	
	private List<TexturedEntity> entities = new ArrayList<>();
	private List<TexturedEntity> entityRemovalQueue = new ArrayList<>();
	
	public static final Rectangle screen = new Rectangle(0, 0, 100, 100);
	
	public void addEntity(TexturedEntity entity) {
		entities.add(entity);
	}
	
	public void removeEntity(TexturedEntity entity) {
		entityRemovalQueue.add(entity);
	}
	
	public List<TexturedEntity> getAllEntities() {
		return entities;
	}
	
	public void update() {
		entityRemovalQueue.forEach((entity) -> {
			entities.remove(entity);
		});
		entityRemovalQueue.clear();
		entities.forEach((entity) -> entity.update()  );
	}
	
	public List<TexturedEntity> getEntitiesList() {
		return entities;
	}
	
}
