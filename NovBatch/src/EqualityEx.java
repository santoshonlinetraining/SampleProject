
public class EqualityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 10;
		
		if(a == b) {
			System.out.println("A is equals to B");
		} else {
			System.out.println("A is not equals to B");
		}
		
		String name1 = "Digital";
		String name2 = "digital";
		
		if(name1 == name2) {
			System.out.println("both names are same");
		} else {
			System.out.println("both names are NOT Same");
		}
		
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("both strings are same");
		} else {
			System.out.println("both strings are not same");
		}
		
		name1 = "Santosh";
		name2 = "Shiva";
		
		if(name1 != name2) {
			System.out.println("both are not matching PASS");
		} else {
			System.out.println("both are matching FAIL");
		}
		
	}

}

