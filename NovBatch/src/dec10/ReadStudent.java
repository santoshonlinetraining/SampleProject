package dec10;

public class ReadStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student obj = new Student();
		
		obj.setStudentName("Ram");
		obj.setstudentMarks(890);
		obj.setsutdentTotMarks(1000);
				
		String name = obj.getstudentName();
		String grade = obj.getStudentGrade();
		
		System.out.println("Name of the student " + name);
		System.out.println("Grade of the student is " + grade);
		
		obj.setStudentName("Pranay");
		obj.setstudentMarks(899);
		obj.setsutdentTotMarks(1000);
				
		 name = obj.getstudentName();
		 grade = obj.getStudentGrade();
		
		System.out.println("Name of the student " + name);
		System.out.println("Grade of the student is " + grade);
		
	}

}

