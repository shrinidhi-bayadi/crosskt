package impquestions;

public class Constructor_Overloading {
	Constructor_Overloading()
	{
		System.out.println("This is construcotr 1");
	}
	
	Constructor_Overloading(int num)
	{
		System.out.println("This is construcotr 2 "+num);
	}
	Constructor_Overloading(String name )
	{
		System.out.println("This is construcotr 3"+name);
	}
	
	
	public static void main(String[] args) {
		new Constructor_Overloading();
	    new Constructor_Overloading(10);
		new Constructor_Overloading("Ram");
		
	}
	
}
