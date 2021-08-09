
abstract class shape {
	
	public abstract void draw();
	
}

class Rectangle extends shape {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle...");
	}
}

class circle extends shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle...");
	}
}

class line extends shape{

	@Override
	public void draw() {
		System.out.println("Drawing Line...");
	}
}

public class Que5_Shapes {

	public static void main(String[] args) {
			shape c1=new circle();
			shape r1=new Rectangle();
			shape l1=new line();
			c1.draw();
			r1.draw();
			l1.draw();
	}
}
