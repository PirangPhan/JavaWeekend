package abstractandinterface;

public class Button {
	OnClickListener clickListener;
	
	void setOnClickListener(OnClickListener clickListener){
		this.clickListener = clickListener;
	}
	
	void click(){
		clickListener.onClicked();
	}
}
