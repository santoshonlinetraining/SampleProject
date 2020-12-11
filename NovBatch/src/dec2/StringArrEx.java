package dec2;

public class StringArrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[5];
		
		str[0] = "Digital";
		str[1] = "Cutlet";
		str[2] = "institute";
		str[3] = "Ameerpet";
		str[4] = "Hyderabad";
		
		int lenOfAString = str.length;
		
		for(int i=0; i<lenOfAString; i++) {
			System.out.print(str[i]);
		}
		
	}

}
