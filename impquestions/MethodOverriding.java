package impquestions;

class ParentMO {

	void addition(int a, int b) {
		System.out.println("Parent Sum-->" + (a + b));
	}
}

public class MethodOverriding extends ParentMO {


	void addition(int a, int b) {
		super.addition(1, 2);
		System.out.println("Child Sum-->" + (a + b));
	}

	public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		m.addition(1, 2);

	}

	
}
