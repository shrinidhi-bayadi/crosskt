package impquestions;


class GrandParent
{
	
	void display1()
	{
		System.out.println("this is grand parent class non static method");
	}
	static void display2()
	{
		System.out.println("this is grand parent class non static method");
	}
}

class ParentP8 extends GrandParent
{
	void display3()
	{
		System.out.println("this is  parent class non static method");
	}
	static void display4()
	{
		System.out.println("this is  parent class  static method");
	}
}
public class MultiLevelInheritance extends ParentP8{
	void display5()
	{
		System.out.println("this is  child class non static method");
	}
	static void display6()
	{
		System.out.println("this is  child class  static method");
	}
	public static void main(String[] args) {
		
		MultiLevelInheritance m=new MultiLevelInheritance();
		display6();
		display4();
		display2();
		
		m.display1();
		m.display3();
		m.display5();
	}
}
