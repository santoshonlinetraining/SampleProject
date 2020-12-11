package dec2;

public class ArraysEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		int[] num = new int[9];
		
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		num[5] = 60;
		num[6] = 70;
		num[7] = 80;		
		num[8] = 90;
		num[9] = 100;
		
		
		
		int count;
		count = num.length;
		
		System.out.println("count of array is => " + count);
		
		System.out.println(num[4]);
		System.out.println(num[6]);
		
		for(int i:num) {
			System.out.println(i);
		}
		
	
	}

}
