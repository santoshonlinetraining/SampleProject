package nov27_methods;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodEx2 obj = new MethodEx2();
		obj.add();
		obj.add2();
		obj.add3(100, 200);
		obj.add3(555, 666);
		
		int result = obj.add4(300, 400);
		System.out.println("Add4 methods response is " + result);
		
		obj.add5(result, 500);
			
	}
	
	void add5(int a, int b) {
		int c = a +b;
		System.out.println("sum of abd and b is " + c);
	}
	
	int add4(int a, int b) {
		int c = a + b;
		return c;
	}
	
	String name() {
		String a = "hello";
		return a;
	}
	
	void add3(int a, int b) {
		int c;
		c = a + b;
		System.out.println("Sum of a and b is " + c);
	}
	
	void add() {
		int a = 10;
		int b = 20;
		int c;
		c = a+b;
		System.out.println("Sum of a and b is " + c);
	}
	
	void add2() {
		int a = 11;
		int b = 22;
		int c;
		c = a+b;
		System.out.println("Sum of a and b is " + c);
	}

}
