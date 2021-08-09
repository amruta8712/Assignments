import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		int divident,divisor;
		Scanner val=new Scanner(System.in);
		System.out.println("enter divident and divisor");
		divident=val.nextInt();
		divisor=val.nextInt();
		
		try {
			System.out.println("Result of division is : "+(divident/divisor));
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero exception");
			//e.printStackTrace();
			throw new UnsupportedOperationException();
		}
	}

}
