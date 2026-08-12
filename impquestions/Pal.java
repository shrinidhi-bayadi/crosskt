package impquestions;

import java.util.Scanner;

public class Pal {
public static void main(String[] args) {
	
	System.out.println("Enter a String");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	sc.close();
	String rev="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
	rev=rev+s.charAt(i);
		
	}
	if(rev.equals(s))
		System.out.println("palindrome");
	else
		System.out.println("Not Palindrome");
}
}
