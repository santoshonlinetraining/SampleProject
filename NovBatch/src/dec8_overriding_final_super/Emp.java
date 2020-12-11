package dec8_overriding_final_super;

final class Emp {

	final String companyName = "ABC";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp obj = new Emp();
		obj.salary();
		obj.salary(15000);
		
	}
	
	final void salary() {
		System.out.println("salary is 10000");
	}
	
	void salary(int sal) {
		System.out.println("salary is " + sal);
	}
	

}
