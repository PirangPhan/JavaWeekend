package generic;

public class GenericMain {
	public static void main(String[] args) {
		// Util<String> util = new Util<>();
		// util.setObj("Apple");
		// System.out.println(util.getObj());
		//
		// Util<Integer> utilInt = new Util<>();
		// utilInt.setObj(1);
		// System.out.println(utilInt.getObj());

		Util<Integer, String> util = new Util<>();
		util.setKey(1);
		util.setValue("One");

		System.out.println(util.getValue());

		String[] strArray = { "A", "B", "C" };
		Integer[] intArray = { 1, 2, 3 };
		Util.printArray(intArray);
	}
}
