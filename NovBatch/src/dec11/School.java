package dec11;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class School implements Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School obj = new School();
		
		obj.studentMarks();
		obj.studentRank();
		obj.studentAddress();
		

	}

	@Override
	public void studentMarks() {
		// TODO Auto-generated method stub
		System.out.println("student marks are 800");
		
	}

	@Override
	public void studentRank() {
		// TODO Auto-generated method stub
		System.out.println("student rank is 2");
		
	}

}
