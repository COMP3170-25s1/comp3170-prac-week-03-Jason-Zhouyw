package comp3170.week3;

public class Arrow {
	private Scene scene;
	
	public Arrow() {
		scene = new Scene();
		
	}
	public void draw() {
		scene.draw();
	}
	public void update(float deltaTime) {
		scene.update(deltaTime);
	}
}
