package dec2;

public class IntArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntArrayMethod obj = new IntArrayMethod();
		
		int[] arrVal =  obj.arr();
		
		System.out.println("length of array is " + arrVal.length);
		for(int i:arrVal) {
			System.out.println(i);
		}
		
		int rec = obj.num();
		System.out.println(rec);
		
	}
	
	
		int[] arr() {
			int[] val = {10,20,30};
			return val;
		}
		
		
		int num() {
			int a = 10;
			return a;
		}

}
