package dec1;

public class MethodOverLoadingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoadingEx1 obj = new MethodOverLoadingEx1();
		obj.add(10, 15, 0);
		obj.add();
		obj.add(11, 12);
	}
	
	void add() {
		int a,b;
		a = 10;
		b = 20;
		int c = a+b;
		System.out.println("sum of " + a + " & " + b + " is " + c);
	}
	
	void add(int a, int b) {
		int c = a +b;
		System.out.println("sum of " + a + " & " + b + " is " + c);
	}
	
	void add(int a) {
		int b, c;
		b = 30;
		c = a +b;
		System.out.println("sum of " + a + " & " + b + " is " + c);
	}
	
	void add(int a, int b, int c) {
		c = a +b;
		System.out.println("sum of " + a + " & " + b + " is " + c);
	}
	
	void add(int a, String b) {
		
	}
	
	void add(String a, int b) {
		
	}
	
	void add(String a, String b) {
		
	}
	
}
