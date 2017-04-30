package homework;

public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 10);
		System.out.println(r1.calculateArea());
		
		System.out.println(r1.calculateArea(10, 20));
		r1.showInfo();
	}
}
