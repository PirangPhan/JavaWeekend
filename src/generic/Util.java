package generic;

public class Util<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public static <E> void printArray(E[] array) {
		for (E e : array) {
			System.out.println(e);
		}
	}

}
