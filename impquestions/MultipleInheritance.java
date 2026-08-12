package impquestions;


interface interface1
{
	void add(int a,int b);
}

interface interface2
{
	void sub(int a,int b);
}
public class MultipleInheritance implements interface1,interface2 {
	
	
	public void add(int a,int b)
	{
		System.out.println("Sum-->"+(a+b));
	}

	
	public void sub(int a, int b) {
		System.out.println("Sub-->"+(a-b));
	}
	
	public static void main(String[] args) {
		
		MultipleInheritance m=new MultipleInheritance();
		m.add(10, 10);
		m.sub(10, 2);
		
	}

}
