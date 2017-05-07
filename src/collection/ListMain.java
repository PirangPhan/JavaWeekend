package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Book");
		list.add("Car");
		list.add("Door");

		for (String string : list) {
			System.out.println(string);
		}

		List<User> userList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			userList.add(new User(i + 1, "User " + (i + 1)));
		}

		userList.remove(0);
		userList.remove(userList.size() - 1);
		printArray(userList);

	}

	static void printArray(List<User> userList) {
		for (int i = 0; i < userList.size(); i++) {
			User user = userList.get(i);
			System.out.println(user.getName());
		}
	}
}


