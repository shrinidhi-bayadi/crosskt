package impquestions;
import java.util.*;
import java.util.Map.Entry;

public class MAp_it {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(1, "shri");
	m.put(2, "Ram");
	m.put(3, "Kavaya");
	System.out.println("Map-->"+m);
	
	Set<Integer> s=m.keySet();
	for(int i:s)
	{
		System.out.println(i);
	}
	
	Collection<String> c=m.values();
	for(String i:c)
	{
		System.out.println(i);
	}
	Set<Entry<Integer,String>> pair=m.entrySet();
	for(Entry<Integer,String> i:pair)
	{
		System.out.println(i);
	}
}
}
