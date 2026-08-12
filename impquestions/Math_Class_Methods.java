package impquestions;

import java.util.Scanner;

/*
 * Write a java program which takes 2 numbers a and b from user at run time and perform below operation:

Please use methods from Math class
1.square root of a
2.maximum
3.minimum
4.a*b
5.a+b
6.a-b
7.Absolute value of a

 */
public class Math_Class_Methods {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter 2 numbers ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	sc.close();
	System.out.println("squareroot of a -->"+Math.sqrt(a));
	
	System.out.println("Maximum -->"+Math.max(a, b));
	System.out.println("minimum -->"+Math.min(a, b));

	System.out.println("Add -->"+Math.addExact(a, b));

	System.out.println("multiply -->"+Math.multiplyExact(a, b));

	
	System.out.println("subtract -->"+Math.subtractExact(a, b));
System.out.println("Absolute value of a -->"+Math.abs(a));

Method_Constructor_Overloading m1=new Method_Constructor_Overloading();
m1.add(22.3f, 12.3f);
	}
}
