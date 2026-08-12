package impquestions;

import java.util.Scanner;

public class NumberPresentinArray {

	
	public static void main(String[] args) {
		
		System.out.println("enter number to check");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Eneter size of array");
		
		int size=sc.nextInt();
		System.out.println("Eneter arrays values");
		
		int numbers[]=new int[size];
		boolean t=false;
		for(int i=0;i<numbers.length;i++)
		{
			
			numbers[i]=sc.nextInt();
			if(numbers[i]==num)
				t=true;
		}
		
		if(t)
		{
			System.out.println("number present");
		}
		
		else
			System.out.println("number not present");
		sc.close();
	}
}
