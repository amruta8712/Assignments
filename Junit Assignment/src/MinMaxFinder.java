import java.util.Arrays;

public class MinMaxFinder {
	
	//Que1- findMinMax()
	public int[] findMinMax(int[] arr) {
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		int[] result= {min,max};
		System.out.println(result);
		return result;
	}
	
	//Que2 to find separate Min and Max
	public int getMin(int[] arr) {
		Arrays.sort(arr);
		int min=arr[0];
		return min;
	}
	
	public int getMax(int[] arr) {
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		return max;
	}
	
}
