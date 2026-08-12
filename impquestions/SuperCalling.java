package impquestions;


class ParentSuper
{
	
	ParentSuper(int a)
	{
		System.out.println("Parent Constructor2"+a);
	}
}

public class SuperCalling extends ParentSuper{
	
	
	SuperCalling()
	{
		super(10);
		System.out.println("Child class Construcotr");
	}
	public static void main(String[] args) {
		new SuperCalling();
		
	}

}
