package curs13.tema;

public class WrongGradeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WrongGradeException() {
        super("Nota introdusa gresit!");
    }

}
