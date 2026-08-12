package impquestions;
/*
 * Write a Java program to demonstrate primitive type casting.

1)Widening
2)Narrowing
 */
public class Primitive_TypeCasting {
public static void main(String[] args) {
	
	//widening implicitely
	byte a=10;
	int b=(int)a;
	
	
	System.out.println("Byte a-->"+a);
	System.out.println("int b-->"+b);
	
	//narrowing
	
	long l=444446655555565555l;
	int i=(int)l;
	System.out.println("Long-->"+l);
	System.out.println("int-->"+i);
}
}
