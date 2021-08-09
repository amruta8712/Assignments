import java.util.Scanner;

public class result {

	public static void main(String[] args) {
		int a,b,c;
		Scanner val=new Scanner(System.in);
		System.out.println("enter the marks or three subjects");
		a=val.nextInt();
		b=val.nextInt();
		c=val.nextInt();
		if(a>60 && b>60 && c>60) {
			System.out.println("Rsult:PASS");
		}
		else if((a>60 && b>60)||(b>60 && c>60)||(a>60 && c>60)) {
			System.out.println("Result:PROMOTED");
		}  
		else if(a>60 || a<60 && b<60 && c<60) {
			System.out.println("Result:FAIL");
		}	
	}
}
