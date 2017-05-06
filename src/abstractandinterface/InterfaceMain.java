package abstractandinterface;

public class InterfaceMain {
	public static void main(String[] args) {
		Movable m = new Lexus();
		m.moveLeft();
	}
}

class Lexus implements Movable {

	@Override
	public void moveLeft() {
		System.out.println("Lexus Move Left");
		
	}

	@Override
	public void moveRight() {
		System.out.println("Lexus Move Right");		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
}


