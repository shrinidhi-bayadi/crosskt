package impquestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Eneter a String ");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		
		}
		
		System.out.println("Revered String is -->"+rev);
		sc.close();
	}
	
}
