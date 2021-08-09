
public class bubbleSort {

	public static void main(String[] args) {
		int[] a= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int n=a.length;
		int temp;
		System.out.println("Array elements before sorting are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Bubble sort algorithm
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array elements After sorting are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
