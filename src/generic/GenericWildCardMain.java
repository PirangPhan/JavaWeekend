package generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericWildCardMain {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person());
		
		List<Student> studentList = new LinkedList<>();
		studentList.add(new Student());
		
		print(personList);
		print(studentList);
		
	}
	
	static void print(List<? extends Person> personList){
		for (Person p : personList) {
			p.showInfo();
		}
	}
}

class Person {
	void showInfo() {
		System.out.println("Person");
	}
}

class Student extends Person {
	@Override
	void showInfo() {
		System.out.println("Student");
	}
}
