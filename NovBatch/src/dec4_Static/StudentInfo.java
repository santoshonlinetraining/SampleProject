package dec4_Static;

public class StudentInfo {

	String schoolName = "VPS";
	
	void displayStudentInfo(String stuName, int rNo) {
		
		System.out.println("student information " + stuName + rNo + schoolName);
		
	}
	

	void displayStudentInfoNew(String stuName, int rNo, String schoolName) {
		
		System.out.println("student information " + stuName + rNo + this.schoolName);
	
		
		this.displayStudentInfo("laxman", 10);
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String studentName = "Ram";
		int rollNo = 5;
		
		StudentInfo obj = new StudentInfo();
		obj.displayStudentInfo(studentName, rollNo);
		
		obj.displayStudentInfoNew(studentName, rollNo, "ZPS");
		
	}

}
