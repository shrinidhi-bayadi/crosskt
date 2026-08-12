package impquestions;

import java.util.Arrays;
import java.util.Scanner;

//WAP to check if 2 Strings are Anagram 
public class Anargam {

	
	public static void main(String[] args) {
		System.out.println("Enter String 1");
		
		Scanner sc=new Scanner(System.in);
				String s1=sc.next();
				
				System.out.println("Enter String 2");
				
				String s2=sc.next();
				
				if(s1.length()!=s2.length())
				{
					System.out.println("2 strings are not anargam!!");
				}
				
				else
				{
				char c1[]=s1.toCharArray();
				char c2[]=s2.toCharArray();
				Arrays.sort(c1);
				Arrays.sort(c2);
				
				if(Arrays.equals(c1, c2))
				System.out.println("2 strings are anargam");
				else
					System.out.println("2 strings are not anargam");
				}
				sc.close();
				
	}
}
