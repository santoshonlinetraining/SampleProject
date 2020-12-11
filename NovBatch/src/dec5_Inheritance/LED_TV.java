package dec5_Inheritance;

public class LED_TV extends BlackAndWhiteTV {

	void remote() {
		System.out.println("Remote");
	}
	
	void smartFeatures() {
		System.out.println("smartFeatures");
	}
	
	void youTubeChannel() {
		System.out.println("YouTube Access");
	}
	
	void PictureTube() {
		System.out.println("i am from color TV picture tube");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LED_TV obj = new LED_TV();
		obj.createTV();
		
	}
	
	void createTV() {
		Channel();
		OnOffButton();
		Volume();
		Brightness();
		Contrast();
		//new LED TV FEatures
		PictureTube();
		remote();
		smartFeatures();
		youTubeChannel();
		
		System.out.println("creating LED TV is done and ready to use");
	}

}
