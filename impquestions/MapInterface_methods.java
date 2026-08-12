package impquestions;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_methods {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Tom");
		m.put(2, "Ram");
		m.put(3, "Max");
		m.put(4, "Ram");

		System.out.println("Map-->" + m);

		m.putIfAbsent(5, "Emily");
		System.out.println("Map-->" + m);

		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("Ram"));

		Map<Integer, String> m2 = new HashMap<Integer, String>();
		m2.putAll(m);
		System.out.println("m2-->" + m2);
		System.out.println(m2.equals(m));
		System.out.println(m2.remove(2));
		System.out.println("m2-->" + m2);
		m2.remove(3, "Max");
		System.out.println("m2-->" + m2);

		m2.replace(4, "Sham");
		System.out.println("m2-->" + m2);

		m2.clear();
		System.out.println("m2-->" + m2);
		System.out.println(m2.isEmpty());

	}
}
