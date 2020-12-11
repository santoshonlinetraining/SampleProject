package dec11;

public class MainBranchOfSchool implements Student, Teachers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainBranchOfSchool obj = new MainBranchOfSchool();
		obj.salary();
		obj.subject();
		obj.studentMarks();
		obj.studentRank();		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("Salary is 15000");
	}

	@Override
	public void subject() {
		// TODO Auto-generated method stub
		System.out.println("Subject Java");
	}

	@Override
	public void studentMarks() {
		// TODO Auto-generated method stub
		System.out.println("Student marks are 800");
	}

	@Override
	public void studentRank() {
		// TODO Auto-generated method stub
		System.out.println("Student rank is 1");
	}

}
