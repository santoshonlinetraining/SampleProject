package dec3_Constructors_and_Static;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj = new Employee();
		
		Employee obj2 = new Employee("Shiva");
		
		Employee obj3 = new Employee("WiproIBM", "Ramu");
		
		Emp obj4 = new Emp();
		
	}
	

	Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Emp Name is Santosh");
	}
	
	Employee(String name){
		System.out.println("Emp name is "  + name);
	}
	
	Employee(String companyName, String EmpName){
		System.out.println("Name of the company is " + companyName);
		System.out.println("Name of the emp is " + EmpName);
	}
	
}
