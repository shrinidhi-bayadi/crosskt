package impquestions;

import java.util.Scanner;

//WAP  to generate fibonacci series of first n numbers
public class Fibonacci {
public static void main(String[] args) {
	
	int a=0,b=1,c=0;
	
	System.out.println("Eneter the value of n");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	if(n==0)
	{
		System.out.println("Fib is  "+a);
	}
	else
	{
		System.out.print ("Fib is "+a+" "+b+" ");
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		System.out.print(c+" ");	
		}
	}
}
}
