package superexample;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle(10, 20);
		c.showInfo();
	}
}

class Shape {

	private int width;
	private int height;

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void showInfo(){
		System.out.println("Width=" + this.width + ", height=" + this.height);
	}
}

class Circle extends Shape {

	public Circle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("ShowInfo in Circle");
	}
	
}
