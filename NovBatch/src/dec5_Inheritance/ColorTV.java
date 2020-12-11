package dec5_Inheritance;

public class ColorTV extends BlackAndWhiteTV {
	int a = 10;
	void PictureTube() {
		System.out.println("i am from color TV picture tube");
		
	}
	
	void Remote() {
		System.out.println("i am a Remote");
	}
	
	void Smartfeatures() {
		System.out.println("i have added new samrt features");
	}	
	
	public static void main(String[] args) {
		ColorTV obj = new ColorTV();
		obj.createTV();
		System.out.println(obj.a);
	}
	
	void createTV() {
		Channel();
		OnOffButton();
		Volume();
		Brightness();
		Contrast();
		super.PictureTube();
		//new feature TV
		Remote();
		Smartfeatures();
		System.out.println("Creating color TV is done and ready to use");
	}
	
}
