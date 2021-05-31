package exceptions;

public class SueldoJuniorException extends Exception{
	
	private static final String JUNIOR_EXCEPTION = "Salary of junior employees must be between 900 and 1600€";
	
	public SueldoJuniorException() {
		super(JUNIOR_EXCEPTION);
	}

}
