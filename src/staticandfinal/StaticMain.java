package staticandfinal;
import java.util.ArrayList;

public class StaticMain {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(new Student());
		}
		
		for (Student student : list) {
			System.out.println(student.getId());
		}
		
	}
}

class Student {
	private int id;
	private String name;

	static int number;

	static {
		number = 0;
	}

	public Student() {
		this.id = ++number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
