package impquestions;

import java.util.Arrays;

public class Ana {
public static void main(String[] args) {
	String s1="Ram";
	String s2="amR";
	if(s1.length()!=s2.length())
	{
		System.out.println("2 strings are not anargam");
	}
	else
	{
	char[] c1=s1.toCharArray();
	char[]c2=s2.toCharArray();
	
Arrays.sort(c1);
Arrays.sort(c2);	
if(Arrays.equals(c1, c2))
	System.out.println("Anargam");
else
	System.out.println("Not Anargam");
}
	
}}
