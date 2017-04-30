package inheritance;

public class Audi extends Car {
	int led;
	Engine engine;
	@Override
	public String toString() {
		return "Audi [led=" + led + ", engine=" + engine + ", id=" + id + ", brand=" + brand + ", color=" + color + "]";
	}
	
	
}
