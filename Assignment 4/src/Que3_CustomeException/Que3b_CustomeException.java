package Que3_CustomeException;

import java.util.Scanner;

public class Que3b_CustomeException {

	public static void main(String[] args) {
		
		long id;
		double balance;
		double withdraw;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your account ID");
		id=scan.nextLong();
		System.out.println("Enter your account Balance");
		balance=scan.nextDouble();
		System.out.println("Enter withdraw amount");
		withdraw=scan.nextDouble();
		
		//Part 2:Raising IllegalBankTransactionException
		
		try {
			if(withdraw<0) {
				System.out.println("Exception Caught:Invalid Withdraw Amount");
				throw new IllegalBankTransactionException("Invalid Withdraw Amount");
			}
			else {
				System.out.println("Withdrawing successfully.....!");
				System.out.println("Remaining balance is : "+(balance-withdraw));
			}
		} catch (IllegalBankTransactionException e) {
			e.printStackTrace();
		}
		

	}

}
