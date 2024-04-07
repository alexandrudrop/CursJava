package curs11package3;

public interface Angajat {

	public static final int salariu = 1000;
	
	void setName();
	String getName();
	void setEmail();
	String getEmail();
	void setName(String name);
	
	//void testCeva();
	
	default void printDept() {
		System.out.println("QA");
	}
	
	
}