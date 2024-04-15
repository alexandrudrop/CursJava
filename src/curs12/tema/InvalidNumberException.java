package curs12.tema;

class InvalidNumberException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNumberException() {
        super("You have entered an invalid number!");
    }
}