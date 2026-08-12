package impquestions;
//single level inheritance

class Parent
{
	
	void display()
	{
		System.out.println("This is non static method");
	}
	
	static void display2()
	{
		System.out.println("This is static method");
	}
}


	

public class Single_Level_Inheritance extends Parent {

	void add(int a,int b)
	{
		System.out.println("sum-->"+(a+b));
	}
	
	static void show()
	{
		System.out.println("child class static method");
	}
	public static void main(String[] args) {
		
		Single_Level_Inheritance c=new Single_Level_Inheritance();
		c.add(2, 3);
		c.display();
		display2();

		show();
	}
}
