package Que3_CustomeException;

public class IllegalBankTransactionException extends Exception{
	
	public IllegalBankTransactionException(String message){
		super(message);
	}

}
