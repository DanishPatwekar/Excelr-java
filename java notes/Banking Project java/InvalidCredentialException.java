package day21bankingapp;

public class InvalidCredentialException extends RuntimeException {
	String message;
	public InvalidCredentialException(String message)
	{
		super(message);
	}

}
