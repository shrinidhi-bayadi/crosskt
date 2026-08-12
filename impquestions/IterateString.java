package impquestions;

import java.util.Arrays;
import java.util.Scanner;

//WAP to enter a String using Scanner class and iterate using Array
public class IterateString {
public static void main(String[] args) {
	
	
	System.out.println("Eneter a String");
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	
	char c[]=name.toCharArray();
	System.out.println(Arrays.toString(c)); //[  ]
	
	for(int i=0;i<name.length();i++)
	{
		c[i]=name.charAt(i);
		System.out.println(c[i]);
	}
	sc.close();
}
	
}
