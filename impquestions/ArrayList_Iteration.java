package impquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/*
 *  Write a program to demonstrate Iterator and ListIterator methods in ArrayList.

Store employee names in an ArrayList and perform the following operations:

1. Iterate elements using Iterator and print in forward direction
2. Iterate elements using ListIterator  and Print elements in forward and backward direction
3. Add a new element using add() method
4. Replace an element using set() method
5. Remove an element using remove() method
 */
public class ArrayList_Iteration {
	public static void main(String[] args) {

		ArrayList<String> ename = new ArrayList<String>(Arrays.asList("shree", "Emily", "max", "Liam"));
		System.out.println("Employee name -->" + ename);

		Iterator<String> i1 = ename.iterator();
		System.out.println("Iteration using iterator()");
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		ListIterator<String> i2 = ename.listIterator();
		System.out.println("Iteration using listiterator() forward");

		while (i2.hasNext()) {
			System.out.println(i2.next());

		}
		System.out.println("Iteration using listiterator() backward");

		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}

		
		//ListIterator methods
		i2.add("Shaan");
		System.out.println(ename);
		i2.next();
		i2.set("Laxmi");
		System.out.println(ename);
		
		i2.remove();
		System.out.println(ename);


	}
}
