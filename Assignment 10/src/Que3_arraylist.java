import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que3_arraylist {

	public static void main(String[] args) {
		
		String s = "A quik brown fox jumps over the lazy dog";

		List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));

		System.out.println(myList);

	}

}
