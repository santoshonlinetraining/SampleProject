package dec9_access_modifiers;

class Student {
	
	private int a = 10;
	public int b = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.marks();
	}
	
	private void marks() {
		System.out.println("Total marks are " + 800);
	}

}
