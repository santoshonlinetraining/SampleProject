package dec8_overriding_final_super;

public class ColorTV extends BlackAndWhiteTV{

	int noOfTVs = 2000;
	
	void Channel(int a) {
		
		System.out.println("i hold channels " + a);
	}
	
	public ColorTV() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Creating the Color TV");
	}
	
	void PictureTube() {
		System.out.println("i am from Color TV picture tube");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTV obj = new ColorTV();
		obj.createTV();
		obj.createTVwithLowBudget();
	}
	
	void createTVwithLowBudget() {
		
		super.Channel(100);
		OnOffButton();
		Volume();
		Brightness();
		Contrast();
		PictureTube();
		System.out.println("Low Budget TV creation is done and ready to use");
		System.out.println("create " + super.noOfTVs + " TV's");
	}
	
	void createTV() {
		Channel(999);
		OnOffButton();
		Volume();
		Brightness();
		Contrast();
		PictureTube();
		System.out.println("creating B&W is done and ready to use");
	}

	
	
	
	
	
	
	
	
	
	
	
}
