package polymorphism;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape();
		// shape.draw();

		Circle circle = new Circle();
		// circle.draw();

		Shape s;
		s = new Rectangle();
		s.draw();

		s = new Circle();
		s.draw();
		s.showShape();
		Circle c = (Circle) s;
		c.showCircle();

		s = new Triangle();
		s.draw();
		
		
		System.out.println("----------");
		ArrayList<Shape> list = new ArrayList<>();
		
		list.add(new Circle());
		list.add(new Rectangle());
		list.add(new Shape());
		list.add(new Square());
		
		for (Shape item: list){
			item.draw();
		}
		
		
	}
}
