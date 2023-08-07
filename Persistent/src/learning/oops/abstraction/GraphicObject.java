package learning.oops.abstraction;

public abstract class GraphicObject {
	int x,y;
	
	void move(int x,int y) {
		System.out.println("move x:"+ x+ "move y:"+ y);
	}
	

	abstract void draw();
	abstract void resize();
}