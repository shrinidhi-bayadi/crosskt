package impquestions;

import java.util.*;


public class ListToSet {
public static void main(String[] args) {
	
	
	//list to set
	List<Integer> list=new ArrayList<Integer>(Arrays.asList(10,20,20,30,40));
	
	System.out.println("List-->"+list);
	
	Set<Integer> set=new HashSet<Integer>(list);
	System.out.println("Set-->"+set);
	
	//set to list
	
	Set<String> name=new HashSet<String>();
	name.add("shri");
	name.add("Emily");
	name.add("Max");
	System.out.println("Set-->"+name);
	
	List<String> namelist=new ArrayList<String>(name);
	namelist.add("Emily");
	System.out.println("Namelist-->"+namelist);

}
}
