package homework;

public class Rectangle {

	float width;
	float height;

	Rectangle() {

	}

	Rectangle(float width) {
		this.width = width;
	}

	Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	float calculateArea(float width, float height) {
		return width * height;
	}

	float calculateArea() {
		float area = this.width * this.height;
		return area;
	}

	void showInfo() {
		System.out.println("Width=" + this.width + ", height=" + this.height);
	}

}
