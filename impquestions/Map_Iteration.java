package impquestions;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Map_Iteration {


	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Tom");
		m.put(2, "Ram");
		m.put(3, "Max");
		m.put(4, "Ram");

		System.out.println("Map-->" + m);

		m.putIfAbsent(5, "Emily");
		System.out.println("Map-->" + m);
		
		Set<Integer> s=m.keySet();
		for(int i:s )
		{
			System.out.println(i);
		}
		
		
		Collection<String> c=m.values();
		for(String i:c)
		{
			System.out.println(i);
		}
		
		Set<Entry<Integer,String>> pair=m.entrySet();
		
		for(Entry<Integer,String>i:pair)
		{
			System.out.println(i);
		}
		
		Iterator<Entry<Integer,String>> it=pair.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	} 
}
