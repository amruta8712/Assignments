import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Que5 {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("Amruta");
		name.add("Patil");
		name.add("Dhanu");
		name.add("Sonali");
		name.add("Patil");
		
		StringBuffer  SB=new StringBuffer("");
		Consumer<List<String>> modify= list -> {
			Iterator<String> it=list.iterator();
			while(it.hasNext()) {
				String str=it.next();
				SB.append(str.charAt(0));
			}	
		};
		
		modify.accept(name);
		
		System.out.println(SB);

	}

}
