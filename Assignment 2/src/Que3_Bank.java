class bankAccount {
	public int initialCash;
	
	public int ammount(int cash) {
		return initialCash;
	}
}

class cuurentAccount extends bankAccount {
	public int CashCredit;
	public int ammount(int cash) {
		CashCredit=cash;
		return CashCredit;
	}
}

class SavingAccount extends bankAccount{
	private int FixDeposite;
	
	public int ammount(int cash) {
		this.FixDeposite=cash;
		return FixDeposite;
	}
}

public class Que3_Bank {

	public static void main(String[] args) {
		int TotalCash;
		bankAccount SA=new SavingAccount();
		bankAccount CA=new cuurentAccount();
		
		TotalCash=SA.ammount(100000)+CA.ammount(10000);
		
		System.out.println("Total cash in the bank is :"+TotalCash);
	}

}
