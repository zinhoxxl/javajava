package ch04_04;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}

}
