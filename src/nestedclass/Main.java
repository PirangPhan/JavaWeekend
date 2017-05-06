package nestedclass;

import abstractandinterface.OnClickListener;

public class Main {
	public static void main(String[] args) {
		new Main().process();
	}

	void process() {
		Button button = new Button();
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClicked() {
				System.out.println("Click From Annonymous");				
			}
		});
		button.click();
	}

}
