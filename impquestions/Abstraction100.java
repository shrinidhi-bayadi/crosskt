package impquestions;
//100% abstarction using class


abstract class Parentabs
{
	abstract void add(int a,int b);
}
public class Abstraction100 extends Parentabs {

	void add(int a, int b) {
		
		System.out.println("Sum is -->"+(a+b));
	}
	
	public static void main(String[] args) {
		
		Abstraction100 a=new Abstraction100();
		a.add(10, 20);
	}
}
