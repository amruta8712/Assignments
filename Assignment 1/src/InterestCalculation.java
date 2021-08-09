import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {
		int p;
		double r,t,SI,CI,CIAmount;
		Scanner val=new Scanner(System.in);
		System.out.println("Enter principal ammount:");
		p=val.nextInt();
		System.out.println("Enter Interest rate in %:");
		r=val.nextDouble();
		System.out.println("Enter the time:");
		t=val.nextDouble();
		SI=p+(p*r*t)/100;
		System.out.println("Simple Interest is:"+SI);
		CIAmount=p*Math.pow((1+r/100),t);
		CI=CIAmount-p;
		System.out.println("Compound Interest is:"+CI);
	}
}
