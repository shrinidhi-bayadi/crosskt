package impquestions;

import java.util.Date;

//WAP to print Current time using Date class

//WAP to print the date
//5 days in the Past and 17 days in future time 
public class Date_Current_program {
	
	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d);
		
		String dateformat=d.toString();
		
		System.out.println("Date  "+dateformat.substring(8, 10));
	System.out.println("Epoch time -->"+d.getTime());
	
	Date d2=new Date(d.getTime()-(1000*60*60*24*5));
	System.out.println("5 days prior "+d2);
	Date d3=new Date(d.getTime()+(1000*60*60*24*17));
	System.out.println("17 days future "+d3);
	
	
	}

}
