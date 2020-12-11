public class CompEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AND
		int a = 10;
		int b = 10;
		
		int c = 30;
		int d = 30;
		
		int e = 50;
		int f = 60;		
		
		if(a == b && c == d && e == f) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		
		//OR
		String name1 = "Digital";
		String name2 = "Digital";
		String name3 = "AmeetPet";
		String name4 = "Hyderabad";
		
		if(name1 == name2 || name3 == name4) {
			System.out.println("Strings are PASS");
		} else {
			System.out.println("Strings are FAIL");
		}
	}

}
