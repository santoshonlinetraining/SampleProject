package dec3_Constructors_and_Static;

public class StaticEx {

	String college = "VBIT";
	
	static String colName = "VBIT"; 
	
	void displayStudentInfo(String studentName, int rollNo, String collegeName) {
		System.out.println(studentName +" "+ rollNo + " " + collegeName);
	}

	void displayStudentInfo(String studentName, int rollNo) {
		System.out.println(studentName +" "+ rollNo + " " + college);
	}
	
	void displayStudentInfoNew(String studentName, int rollNo) {
		System.out.println(studentName +" "+ rollNo + " " + colName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticEx obj = new StaticEx();
		
		obj.displayStudentInfo("Ram", 1, "VBIT");
		obj.displayStudentInfo("Laxman", 2, "VBIT");
		obj.displayStudentInfo("Venkat", 3, "VBIT");
		
		obj.displayStudentInfo("Srinivas", 10);
		obj.displayStudentInfo("Pranay", 11);
		
		
		obj.displayStudentInfoNew("Nagendra", 21);
		obj.displayStudentInfoNew("Niharika", 22);
		
	}

}
