package dec11;

public class Dept extends Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept obj = new Dept();
		obj.salary();
		obj.bonus();
		
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("emp salary 10000");		
	}
	
	

}
