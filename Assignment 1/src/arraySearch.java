import java.util.Scanner;

public class arraySearch {

	public static void main(String[] args) {
		int num,f = 0;
		Scanner val=new Scanner(System.in);
		int[] array= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Enter number to search from the given array");
		num=val.nextInt();
		for(int i=0;i<array.length;i++) {
			f=0;
			if(num==array[i]) {
				f=1;
				break;
			}	
		}
		if(f==1)
			System.out.println("Nmber is present");
		else
			System.out.println("Nmber NOT is present");
	}

}
