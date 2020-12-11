package dec8_overriding_final_super;

public class BlackAndWhiteTV {
	int noOfTVs = 100;
	
	public BlackAndWhiteTV() {
		// TODO Auto-generated constructor stub
		System.out.println("i am creating the Black and White TV");
	}
	
	void Channel(int a) {
		
		System.out.println("i hold channels " + a);
	}
	
	void OnOffButton() {
		System.out.println("i am from on off button");
	}
	
	void Volume() {
		System.out.println("i am from volume increase and decrease");
	}
	
	void Brightness() {
		System.out.println("i am from Brightness");
	}
	
	
	void Contrast() {
		System.out.println("i am from Contrast feature");
	}
	
	void PictureTube() {
		System.out.println("i am from Black and White TV picture tube");
	}

	public static void main(String[] args) {
		BlackAndWhiteTV obj = new BlackAndWhiteTV();	
		obj.createTV();
	}
	
	void createTV() {
		this.Channel(100);
		OnOffButton();
		Volume();
		Brightness();
		Contrast();
		PictureTube();
		System.out.println("creating B&W is done and ready to use");
	}


}
