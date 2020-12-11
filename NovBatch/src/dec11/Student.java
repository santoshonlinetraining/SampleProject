package dec11;

public interface Student {
	
	abstract void studentMarks();
	
	void studentRank();
		
	default void studentAddress() {
		System.out.println("Miyapur");
	}

}
