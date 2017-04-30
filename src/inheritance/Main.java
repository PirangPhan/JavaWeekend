package inheritance;

public class Main {
	public static void main(String[] args) {
		Audi audi = new Audi();
		Engine engine = new Engine();
		engine.id = 100;
		engine.power = 50;
		engine.brand = "BMW";
		
		audi.engine = engine;
		audi.led = 10000;
		audi.brand = "Audi";
		audi.color = "Black";
		System.out.println(audi.toString());
		
	}
}
