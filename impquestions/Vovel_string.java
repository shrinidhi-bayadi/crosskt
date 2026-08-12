package impquestions;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * WAP enter a sentence and print below outputs
  1.Split sentence into words
  2.count number of words 
  3.Reverse the words in sentence (Ex: sentence -> I Love Automation 
    Reverse-->Automation Love I
  4.count vowels in sentence
 */
public class Vovel_string {
	static int count=0;
	public static void main(String[] args) {
		
		System.out.println("Enter a Sentence");
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		String word[]=s.split(" ");
		System.out.println("Words are -->"+Arrays.toString(word));
		System.out.println("Number of words "+word.length);
		String rev[]=new String[word.length];
		
		for(int i=word.length-1,j=0;i>=0;i--,j++)
		{
			rev[j]=word[i];
		}
		System.out.println("Reverse String is "+Arrays.toString(rev));
		

		
		for(int i=0;i<s.length();i++)
		{
			char ch=Character.toLowerCase(s.charAt(i));
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
		}
 
		
		System.out.println("reverse String word ");
		for(int i=0;i<word.length;i++)
		{
			System.out.print(rev[i]+" ");
		}
		System.out.println("nu of vovelw"+count);
		sc.close();
	}

}
