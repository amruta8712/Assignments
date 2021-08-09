
public class ArmstrongInRange {

	public static void main(String[] args) {
		int num,temp,rem,sum,start,end;
		start=100;
		end=999;
		System.out.println("Armstrong numbers between 100 to 999 are:");
		for(int i=start;i<=end;i++) {
			num=i;
			temp=num;
			sum=0;
			while(temp!=0) {
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
			}
			if(sum==num)
				System.out.println(num);
		}

	}
}
