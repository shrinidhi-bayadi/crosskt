
package impquestions;
/*
 * WAP to demonstrate all the methods of StringBuffer Class.
 *  (capacity, append, replace, insert, reverse and delete)
 */
public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("Automation");
	
		s1=s1.append("Testing");
		System.out.println(s1);
		System.out.println("capacity-->"+s1.capacity());
		System.out.println(s1.replace(10, 17, "Class"));
		s1=s1.insert(0, "Hi");
		System.out.println(s1);
		//System.out.println(s1.reverse());
		
		System.out.println(s1.delete(0, 2));
	}
}
