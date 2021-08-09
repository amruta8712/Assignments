import java.util.ArrayList;
import java.util.List;



public class Que3_GenericMethod {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);

        Integer[] intArray = new Integer[intList.size()];
        intArray = intList.toArray(intArray);

		System.out.println("Before Swapping Array Elements:");
		for(Integer e:intArray) {
			System.out.print(e+" ");
		}
		
		swap(intArray,1,3);
		
		System.out.println("\nAfter Swapping Array Elements:");
		for(Integer e:intArray) {
			System.out.print(e+" ");
		}
		
	}
	
	public static <E> void swap(E[] arr,int i, int j) {
		E temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
