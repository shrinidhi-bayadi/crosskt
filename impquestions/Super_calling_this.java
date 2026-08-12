package impquestions;
/*
 * Write a program to demonstrate super calling statement using both parameterized 
 * and non-parameterized constructors in multilevel inheritance.
 */
class Grandp
{
	Grandp()
	{
		System.out.println("Construcor 1");
	}
}

class Parnt extends Grandp
{
	Parnt()
	{
		this("Shru");
		System.out.println("Constructor 2");
	}
	

	Parnt(String name)
	{
		System.out.println("Constructor 2"+name);
	}
}

public class Super_calling_this extends Parnt{
	Super_calling_this()
	{this(10);
		System.out.println("Construcor 3");
	}
	
	Super_calling_this(int a)
	{
		System.out.println("Construcor 3"+a);
	}
	public static void main(String[] args) {
		new Super_calling_this();
		
		
	}

}
