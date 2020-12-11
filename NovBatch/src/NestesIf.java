
public class NestesIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String instituteName = "DigitalCutlet";
		
		String studestCourse = ".Net";
		
		if(instituteName == "DigitalCutlet") {
			
			if(studestCourse == "java") {
				System.out.println("Student is learning Java");
			}
			else if(studestCourse == ".Net") {
				System.out.println("Student is learning .net");
			}
			else if(studestCourse == "Selenium") {
				System.out.println("Student is learning Selenium");
			}
			else {
				System.out.println("Student is not learning anything from our istitute");
			}
		}
		else {
			System.out.println("Student is not DigitalCutlet Student");
		}
		
	}

}
