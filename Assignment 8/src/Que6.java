import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Que6 {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("Amruta");
		name.add("Patil");
		name.add("Dhanu");
		name.add("Sonali");
		name.add("Patil");
		
		System.out.println("Original List:"+name);
		
		name.replaceAll(new UppercaseOperation());
		
		System.out.println("UpperCase List:"+name);

	}

}
class UppercaseOperation implements UnaryOperator<String>{

	@Override
	public String apply(String t) {
		
		return t.toUpperCase();
	}
	
}
