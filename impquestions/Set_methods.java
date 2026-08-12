package impquestions;
import java.util.*;
/*
 * Write a program to demonstrate Set interface using HashSet class.
Perform the following operations:
1. Add elements using add() method
2. Add duplicate elements (check the output)
3. Print all elements
4. Check size of Set
5. Check whether an element is present using contains()
6.Iterate using iterator() method
7.create one more set and check below methods
addAll()
containsAll()
equals()
remove()
removeAll()
clear()
isEmpty()
 */
public class Set_methods {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(10);
		set.add(30);
		set.add(50);
		
//	Scanner sc=new Scanner(System.in);
//	
//	System.out.println("Enter next 3 elements during run time");
//	for(int i=0;i<3;i++)
//	{
//		set.add(sc.nextInt());
//		
//	}
	
	System.out.println("Set collections "+set);
	System.out.println(set.size());
	
	set.add(50);
	System.out.println("Set collections "+set);

	
	Iterator<Integer> i=set.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	Set<Integer> set2=new HashSet<Integer>();
	
	set2.addAll(set);
	System.out.println("Set 2-->"+set2);
	System.out.println(set.containsAll(set2));
	
	System.out.println(set.equals(set2));
	
	set2.remove(10);
	System.out.println("Set 2-->"+set2);
set2.removeAll(set);

System.out.println("Set 2-->"+set2);

System.out.println(set2.isEmpty());
	
	}
}
