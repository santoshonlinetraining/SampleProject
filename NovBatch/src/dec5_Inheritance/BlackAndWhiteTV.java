package dec5_Inheritance;

public class BlackAndWhiteTV {
	int a = 100;
	void Channel() {
		System.out.println("i am from Changing the Channel");
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
		this.Channel();
		OnOffButton();
		Volume();
		Brightness();
		Contrast();
		PictureTube();
		System.out.println("creating B&W is done and ready to use");
	}


}
