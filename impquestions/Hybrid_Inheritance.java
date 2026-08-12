package impquestions;


class Parent_Hy
{
	void displayHy()
	{
		System.out.println("this is parent class method");
	}
}

class childHy1 extends Parent_Hy
{
	
	void add(int a,int b)
	{
		System.out.println("Sum-->"+(a+b));
	}
}
class childHy2 extends Parent_Hy
{
	
	 void sub(int a,int b)
	{
	System.out.println("Sub-->"+(a-b));
	}
}
class grandChild extends childHy1
{
	void show()
	{
		System.out.println("This is grand child method");
	}
}
public class Hybrid_Inheritance {
public static void main(String[] args) {
	

	grandChild g=new grandChild();
	g.displayHy();
	g.add(10, 20);
	g.show();
	childHy2 hy2=new childHy2();
	hy2.displayHy();
	hy2.sub(33, 10);
	}
}
