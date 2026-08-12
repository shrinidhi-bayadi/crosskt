package impquestions;
//wap on method overloading

public class Method_Overloading {

	
	void add(int a,int b)
	{
		
		System.out.println("Sum of 2 int numbers--> "+(a+b));
	}
	
	
	void add(double a,double b)
	{
		
		System.out.println("Sum 2 double numbers--> "+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		
		System.out.println("Sum of 3 int numbers--> "+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		Method_Overloading m=new Method_Overloading();
		m.add(1, 10, 20);
		m.add(1, 10);
		m.add(1.22, 10.444);

	}
	
}
