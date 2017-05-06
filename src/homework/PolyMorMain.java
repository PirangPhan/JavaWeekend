package homework;

import java.util.ArrayList;

public class PolyMorMain {
	public static void main(String[] args) {
		Person p = new Doctor();
		p.work();
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person());
		list.add(new Doctor());
		list.add(new Employee());
		
		for (Person person : list) {
			person.work();
		}
		System.out.println("-------");
		Util.showPosition(new Employee());
	}
}

class Person {
	void work() {
		System.out.println("Person");
	}
}

class Doctor extends Person {
	@Override
	void work() {
		super.work();
		System.out.println("Doctor");
	}
}

class Employee extends Person {
	@Override
	void work() {
		System.out.println("Employee");
	}
}

class Util {
	static void showPosition(Person p){
		p.work();
	}
}
