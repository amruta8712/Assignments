import java.util.ArrayList;
import java.util.List;

public class Que4 {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("Amruta");
		name.add("Anjali");
		name.add("dhanu");
		name.add("sonali");
		name.add("sangita");
		System.out.println("Beore removing names: "+name);
		name.removeIf(P -> (P.length()%2==1));
		System.out.println("after removing names: "+name);
	}

}
