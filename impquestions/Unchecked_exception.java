package impquestions;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * Write a program to demonstrate runtime exception (unchecked exception) using arrays-->one try and one catch block
ex:NegativeArraySizeException
 */
public class Unchecked_exception {

	public static void main(String[] args) {
		
	
		
		try
		{
			System.out.println("Enter size of an Array -->");
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			String name[]=new String[size];
			System.out.println("Array Elements are-->");
			for(int i=0;i<size;i++)
			{
				name[i]=sc.next();
			}
			System.out.println(Arrays.toString(name));
			sc.close();
		}
		
		catch(NegativeArraySizeException e)
		{
			System.out.println("Please enter positive number only");
		}
		
		finally{
			System.out.println("I always execute");
		}
	
	}
}
