package dec11;

public abstract class Emp {

	abstract void salary();
	
	//abstract void creditCard();
	
	void bonus() {
		System.out.println("Bonus for emp is 1000");
	}
	
	static {
		System.out.println("i amf from static methods");
	}

	Emp(){
		System.out.println("i am from constructor");
	}
	
}
