package impquestions;

public class Method_Constructor_Overloading {

	
	void add(int a ,int b)
	{
		System.out.println("Sum of 2 int numbers -->"+(a+b));
	}
	
	
	void add(float a ,float b)
	{
		System.out.println("Sum of 2 float numbers -->"+(a+b));
	}
	
	Method_Constructor_Overloading()
	{
		System.out.println("This is constructor 1");
	}
	
	Method_Constructor_Overloading(int a)
	{
		System.out.println("This is constructor 2 and number is "+a);
	}
	
	public static void main(String[] args) {
		
		Method_Constructor_Overloading m1=new Method_Constructor_Overloading();
		m1.add(1, 10);
		
		m1.add(1.2f, 2.203f);
		
		new Method_Constructor_Overloading(10);
	}
}
