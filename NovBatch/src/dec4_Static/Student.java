package dec4_Static;

public class Student {
	
	static String schoolName = "VPS";
	static int rollNo = 5;
	
	static void studenInfo() {
		System.out.println("Ramu, 1, V " + schoolName );
	}
	
	
	static int studentMarks() {
		return 99;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student.studenInfo();
		
		Student obj = new Student();
		obj.studenInfo();
		
	}
	
	
	static {
		System.out.println("hello i am from Static block");
	}
	
	

}
