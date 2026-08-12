package impquestions;
import java.util.*;

/*
 * "WAP on collection properties
add marks in to collection
Iterate using iterator()
create one more collection with numbers
explore below methods
addAll()
remove()
contains()
containsAll()
size()
removeAll()
clear()
isEmpty()
equals()"

 */
public class Collection_Methods {
public static void main(String[] args) {
	
	Collection<Integer> c=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	System.out.println(c);
	c.add(20);
	System.out.println(c);

	System.out.println(c.contains(10));
	c.remove(10);
	System.out.println(c);

	c.clear();
	System.out.println(c);

}
}
