package impquestions;
/*
 * Write a Java program to demonstrate 
 * Upcasting and Downcasting (Class Type Casting).
 */


	
	class Parent44
	{
		void display()
		{
			System.out.println("Parent method");
		}
	}
	
	class Child extends Parent44
	{
		void show()
		{
			System.out.println("Child method");
		}
	}
	
	public class Class_TypeCasting {
		public static void main(String[] args) {

//upcasting
		Parent44 p=new Child();
		p.display();
		//downcasting
		Child c=(Child)p;
		c.display();
		c.show();
			
		}
}