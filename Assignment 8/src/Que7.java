import java.util.HashMap;
import java.util.Map;

public class Que7 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amruta");  
		  map.put(101,"Ashok");  
		  map.put(102,"Patil"); 
		  
		  System.out.println(map);
		  
		  StringBuilder SB=new StringBuilder("");
		  
		  for(Map.Entry m:map.entrySet()) {
			  
			  SB.append(m.getKey());
			  SB.append(m.getValue());
		  }
		  System.out.println(SB);

	}

}
