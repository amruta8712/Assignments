import java.util.Scanner;

public class avgMarks {

	public static void main(String[] args) {
		int[][] marks=new int[3][3];
		int sum=0;
		double avg=0;
		Scanner val=new Scanner(System.in);
		System.out.println("enter the marks");
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				marks[i][j]=val.nextInt();
				sum=sum+marks[i][j];
			}
		}
		avg=sum/9;
		System.out.println("sum of all subjects is "+sum+" and average is "+avg );
		for(int i=0;i<marks.length;i++)
		{
			sum=0;
			avg=0;
			for(int j=0;j<marks[i].length;j++)
			{
				
				sum=sum+marks[j][i];
			}
			System.out.println("sum of marks of "+(i+1)+" subject is "+sum);
			avg=sum/(marks[i].length);
			System.out.println("average of marks of "+(i+1)+" subject is "+avg);
		}

	}
}
