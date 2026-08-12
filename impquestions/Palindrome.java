package impquestions;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a String");
	
	String s=sc.next();

	String rev="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
		
		
	}
	System.out.println("REv-->\n"+rev);
	
	if(s.equals(rev))
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("String is not palindrome");
	}
	
	sc.close();
}
}
