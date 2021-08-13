import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	MinMaxFinder minMaxFinder;
	@BeforeEach
	void init() {
		minMaxFinder=new MinMaxFinder();
	}
	int[] arr1= {10,20,30,70,50,40};
	int[] arr2= {56,34,7,3,54,3,34,34,54};
	int[] arr3= {5,25,45,85,35};
	
	@Test
	void testMaxMin() {
		int[] expected= {10,70};
		int[] actual=minMaxFinder.findMinMax(arr1);
		int[] expected1= {3,56};
		int[] actual1=minMaxFinder.findMinMax(arr2);
		int[] expected2= {5,85};
		int[] actual2=minMaxFinder.findMinMax(arr3);
		assertArrayEquals(expected,actual);
		assertArrayEquals(expected1,actual1);
		assertArrayEquals(expected2,actual2);
	}
	
	@Test
	void testMin() {
		int val1=minMaxFinder.getMin(arr1);
		int val2=minMaxFinder.getMin(arr2);
		int val3=minMaxFinder.getMin(arr3);
		assert(val1==10);
		assert(val2==3);
		assert(val3==5);
	}
	
	@Test
	void testMax() {
		int val1=minMaxFinder.getMax(arr1);
		int val2=minMaxFinder.getMax(arr2);
		int val3=minMaxFinder.getMax(arr3);
		assert(val1==70);
		assert(val2==56);
		assert(val3==85);
	}
}
