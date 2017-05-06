package abstractandinterface;

public class AbstractMain {

}

abstract class Person {
	abstract void work();

	abstract void speak();
}

abstract class Doctor extends Person {
	@Override
	void work() {
		System.out.println("Treating People");
	}
}

class Employee extends Person {
	@Override
	void work() {
		System.out.println("Work on MS Office");
	}

	@Override
	void speak() {
		// TODO Auto-generated method stub

	}
}

class Worker extends Doctor {

	@Override
	void speak() {
		// TODO Auto-generated method stub

	}

}