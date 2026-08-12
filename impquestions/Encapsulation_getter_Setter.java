package impquestions;
/*
 *  Create a Student class with private variables name and age.
 Use getter and setter methods to access and 
 modify the data. Display the student details in the main method.
 
 
 */

class Studnet
{

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
}
public class Encapsulation_getter_Setter {

	public static void main(String[] args) {
		
		Studnet s=new Studnet();
		s.setName("Srhi");
		s.setAge(10);
		System.out.println("Name-->"+s.getName());
		System.out.println("age-->"+s.getAge());

	}
}
