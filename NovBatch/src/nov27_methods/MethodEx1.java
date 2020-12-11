package nov27_methods;

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		MethodEx1 obj = new MethodEx1();
		obj.abc();
		obj.xyz();
	}
	
	
	
	void abc() {
		System.out.println("i am from ABC method");
	}
	
	void xyz() {
		System.out.println("i am from XYZ method");
	}
	
}
