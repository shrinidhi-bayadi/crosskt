package impquestions;
//wap on hierarchical inheritance



class Parent_H
{
	void display()
	{
		System.out.println("This is parent class method");
	}
}


class Child1 extends Parent_H
{
	void add(int a,int b)
	{
		System.out.println("Sum-->"+(a+b));
	}
}

class Child2 extends Parent_H
{
	void sub(int a,int b)
	{
		System.out.println("Subtraction-->"+(a-b));
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.add(2, 3);
		c1.display();
		
		Child2 c2=new Child2();
		c2.display();
		c2.sub(10, 2);
	}
}
