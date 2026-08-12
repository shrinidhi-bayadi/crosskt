package impquestions;

import java.util.*;

public class List_methods {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		List<Integer> marks = new ArrayList<Integer>();

		marks.addAll(list);
		System.out.println("List-->" + list);
		System.out.println("marks-->" + marks);

		
		//iteration
		
		Iterator<Integer> i1=list.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		//ListIteration
		
		ListIterator<Integer> i2=list.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		// equals

		System.out.println(list.equals(marks));
		System.out.println(list.contains(10));
		System.out.println(list.containsAll(marks));

		System.out.println(list.get(1));
		System.out.println("marks-->" + marks);
		marks.remove(2);
		System.out.println("marks-->" + marks);
		marks.removeAll(list);
		System.out.println("marks-->" + marks);

		System.out.println(marks.isEmpty());

		list.clear();
		System.out.println("List-->" + list);

//iterate

	}
}
