
public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String studentCourse = "SAP";
		
		switch(studentCourse) {
		
		case "Java":
			System.out.println("Student is learning Java");
			break;
		
		case "Selenium":
			System.out.println("Student is learning Selenium");
			break;
			
		case ".Net":
			System.out.println("Student is learning .Net");
			break;

		case "SAP":
			System.out.println("Student is learning SAP");
			break;

		case "Python":
			System.out.println("Student is learning Python");
			break;

		case "DevOps":
			System.out.println("Student is learning DevOps");
			break;
			
		default:
			System.out.println("Student is not learning anything");
			break;
		}
		
	}

}
