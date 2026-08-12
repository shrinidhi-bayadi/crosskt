
/*
 * WAP to check a String consists 
 * of how many alphabets, numeric values, spaces and special characters.
 */

package impquestions;


import java.util.Scanner;

public class Count_String{


public static void main(String[] args) {
	
 int count_apha=0;
 int count_num=0;
int count_space=0;
 int count_special=0;
	System.out.println("Enter a String");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	char c1[]=name.toCharArray();
	for(int i=0;i<c1.length;i++)
	{
		if(Character.isAlphabetic(c1[i]))
			count_apha++;
		if(Character.isDigit(c1[i]))
			count_num++;
		if(Character.isWhitespace(c1[i]))
			count_space++;
		
	}
	System.out.println("Num of aplha-->"+count_apha);
	System.out.println("Num of num-->"+count_num);

	System.out.println("Num of space-->"+count_space);
 count_special=c1.length-(count_apha+count_num+count_space);
	System.out.println("Num of specia-->"+count_special);
sc.close();
}
	}
	
