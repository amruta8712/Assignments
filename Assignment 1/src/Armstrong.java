import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int num,temp,rem,sum=0;
		Scanner no=new Scanner(System.in);
		System.out.println("Enter no to check");
		num=no.nextInt();
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is NOT Armstrong");
	}

}

