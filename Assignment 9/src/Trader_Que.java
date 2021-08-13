import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Trader{
	String name;
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
}
public class Trader_Que {

	public static void main(String[] args) {
		Trader t1=new Trader("Amruta","Kolhapur");
		Trader t2=new Trader("Anjali","Kolhapur");
		Trader t3=new Trader("Sonali","Kolhapur");
		Trader t4=new Trader("Snehal","Kolhapur");
		Trader t5=new Trader("Yogita","Pune");
		Trader t6=new Trader("Lakshmi","Pune");
		Trader t7=new Trader("Manali","Pune");
		
		List<Trader> trader=new ArrayList<>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		trader.add(t5);
		trader.add(t6);
		trader.add(t7);
		
		//Que 9
		System.out.println("-------UNIQUE CITY--------");
		List<Trader> UniqueCity=trader.stream().filter(DistinctCustomPropertyExample.distinctByKey(P -> P.getCity())).collect(Collectors.toList());
		UniqueCity.forEach(System.out::println);
		
		//Que10
		System.out.println("-------TRADER FROM PUNE--------");
		List<Trader> FromPune=trader.stream().filter(P -> P.city=="Pune").sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());	
		FromPune.forEach(System.out::println);
		
		//Que11
		System.out.println("-------SORTED TRADER NAME--------");
		trader.stream().sorted(Comparator.comparing(Trader::getName)).forEach(P ->System.out.println(P.name));
		
		//Que12
		System.out.println("-------TRADER FROM INDORE--------");
		List<Trader> FromIndore=trader.stream().filter(P -> P.city=="Indore").collect(Collectors.toList());	
		FromIndore.forEach(System.out::println);

	}

}
