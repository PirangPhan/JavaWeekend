package abstractandinterface;

public class Main implements OnClickListener {
	public static void main(String[] args) {
		new Main().process();
	}

	@Override
	public void onClicked() {
		System.out.println("Click From Main");
	}

	void process() {
		Button button = new Button();
		button.setOnClickListener(this);
		button.click(); 
	}

}
