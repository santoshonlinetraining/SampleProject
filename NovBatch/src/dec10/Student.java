package dec10;

public class Student {
	
	private String studentName;
	private int studentMarks;
	private int sutdentTotMarks;
	private String studentGrade;
	
	
	//getter -> to get the values
	String getstudentName() {
		return studentName;
	}
	
	int getStudentMarks() {
		this.studentMarks = studentMarks + 50;
		return studentMarks;
	}
	
	int getStudentTotMarks() {
		return sutdentTotMarks;
	}
	
	String getStudentGrade() {
		int marks = getStudentMarks();
		int totMarks = getStudentTotMarks();
		
		//int a = (getStudentMarks()/getStudentTotMarks())*100;
		
		//System.out.println(a);
		
		if(((getStudentMarks()/getStudentTotMarks())*100) >= 90) {
			return "Grade A";
		} else {
			return "Grade B";
		} 
		
		
	}
	
	//setter -> to set the values
	void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	void setstudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;		
	}
	
	void setsutdentTotMarks(int sutdentTotMarks) {
		this.sutdentTotMarks = sutdentTotMarks;
	}
	
}
