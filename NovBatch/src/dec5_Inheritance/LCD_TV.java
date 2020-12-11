package dec5_Inheritance;

public class LCD_TV extends ColorTV {

	
	void PictureTube() {
		System.out.println("i am from LCD TV picture tube");
	}
	
	void youTube() {
		System.out.println("i am from YouTube");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LCD_TV obj = new LCD_TV();
		obj.createTV();

	}
	
	
	void createTV() {
		Channel();
		OnOffButton();
		Volume();
		Brightness();
		Contrast();
		PictureTube();
		//new feature from colorTV
		Remote();
		Smartfeatures();
		//new features from LCD
		youTube();
		System.out.println("Creating LCD TV is done and ready to use");
	}

}
