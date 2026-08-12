package impquestions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Write a program to accept array size using Scanner and handle 
 1)InputMismatchException
 2)ArrayIndexOutOfBoundsException
 3)NegativeArraySizeException
  use one try and multiple catch block here 
 */
public class Catch_multiple {

	public static void main(String[] args) {
		
		
		try
		{
			System.out.println("enter size of Array");
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int [] name=new int[size];
			for(int i=0;i<4;i++)
			{
				name[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(name));
			sc.close();
		}
		
		catch(NegativeArraySizeException  e1)
		{
			System.out.println("Please enter positive size");
		}
		
		catch(ArrayIndexOutOfBoundsException  e2)
		{
			System.out.println("Please check size");
		}
		catch(InputMismatchException  e3)
		{
			System.out.println("Please enter  valid data");
		}
		
		finally
		{
			System.out.println("I always execute");
		}
	
	}
}
