package impquestions;

import java.util.Scanner;

//find the factorial of given number
public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of n-->");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Please enter positive number");
		}
		
		else
		{
			
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		}
		sc.close();
	}

}
