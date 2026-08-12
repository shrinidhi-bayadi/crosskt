package impquestions;

import java.util.Arrays;
import java.util.Scanner;

//WAP to check if String only consist of alphabets
public class StringAlphabet {
	static int count=0;
	static boolean b=false;
	public static void main(String[] args) {
		
		
		
		System.out.println("Eneter a String");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		char[] c1=name.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++)
		{
		 b=Character.isAlphabetic(c1[i]);
		 if(b)
		 count++;
		}
		if(count==c1.length)
			
			System.out.println("Alpha");
		else
			System.out.println("No");
		sc.close();
	}
}
