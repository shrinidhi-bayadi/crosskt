package impquestions;

public class ThisCalling {

	ThisCalling()
	{
		this("Shri");
		System.out.println("Constructor 1");
	}
	ThisCalling(int a)
	{
		System.out.println("Constructor 2 -->"+a);
	}
	ThisCalling(String n)
	{
		this(20);
		System.out.println("Constructor 3-->"+n);
	}
	

	public static void main(String[] args) {
		
		new ThisCalling();
	
	}
	
}
