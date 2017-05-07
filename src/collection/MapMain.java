package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {
		Map<String, User> map = new HashMap<>();
		map.put("user1", new User(1, "User 1"));
		map.put("user2", new User(1, "User 2"));
		
		System.out.println(map.get("user1").getName());
	}
}
