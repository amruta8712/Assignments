package Que3_CustomeException;

import java.util.Scanner;

public class Que3_Custome {

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
		
		//Part 1: Raising InsufficientBalanceException
		
		try {
			if(withdraw>balance || balance==0) {
				System.out.println("Exception Caught: Insufficient Balance");
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			else {
				System.out.println("Withdrawing successfully.....!");
				System.out.println("Remaining balance is : "+(balance-withdraw));
			}
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
		
		
	}

}
