package impquestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(40, 50, 60));

		marks.add(10);
		marks.add(20);
		System.out.println(marks);

		ArrayList<Integer> Schoolmarks = new ArrayList<Integer>();
		Schoolmarks.addAll(marks);

		System.out.println(marks.equals(Schoolmarks));
		Schoolmarks.add(33);
		System.out.println(Schoolmarks);

		System.out.println(Schoolmarks.contains(10));
		System.out.println(Schoolmarks.containsAll(marks));

		System.out.println(Schoolmarks);

		Schoolmarks.remove(1);
		System.out.println(Schoolmarks);

		Schoolmarks.remove(0);
		System.out.println(Schoolmarks);
		Schoolmarks.removeAll(marks);
		System.out.println(Schoolmarks);
		Schoolmarks.clear();
		System.out.println(Schoolmarks);
		System.out.println(Schoolmarks.isEmpty());
		System.out.println(marks.get(2));

	}
}
