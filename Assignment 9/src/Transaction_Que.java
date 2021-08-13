import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Transcation{
	Trader trader;
	int year;
	int value;
	public Transcation(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transcation [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
}
public class Transaction_Que {
	

	public static void main(String[] args) {
		Trader t1=new Trader("Amruta","Kolhapur");
		Trader t2=new Trader("Anjali","Delhi");
		Trader t3=new Trader("Sonali","Kolhapur");
		Trader t4=new Trader("Snehal","Delhi");
		Trader t5=new Trader("Yogita","Pune");
		Trader t6=new Trader("Vedika","Delhi");
		Trader t7=new Trader("Manali","Pune");
		
		
		Transcation T1=new Transcation(t1,2011,5000);
		Transcation T2=new Transcation(t2,2010,15000);
		Transcation T3=new Transcation(t3,2012,50000);
		Transcation T4=new Transcation(t4,2011,25000);
		Transcation T5=new Transcation(t5,2015,55000);
		Transcation T6=new Transcation(t6,2011,35000);
		Transcation T7=new Transcation(t7,2011,75000);
		
		List<Transcation> trans=new ArrayList<>();
		trans.add(T1);
		trans.add(T2);
		trans.add(T3);
		trans.add(T4);
		trans.add(T5);
		trans.add(T6);
		trans.add(T7);
		
		//Que8
		System.out.println("--------TRANSACTION IN YEAR 2011-------");
		List<Transcation> Year2011=trans.stream().filter(P -> P.year==2011).sorted(Comparator.comparing(Transcation::getValue)).collect(Collectors.toList());
		Year2011.forEach(System.out::println);
		
		//Que14
		System.out.println("--------Highest TRANSACTION-------");
		Transcation Max=trans.stream().max(Comparator.comparing(Transcation::getValue)).get();
		System.out.println(Max);
		
		//Que15
		System.out.println("--------Lowest TRANSACTION-------");
		Transcation Min=trans.stream().min(Comparator.comparing(Transcation::getValue)).get();
		System.out.println(Min);
		
		//Que13
		System.out.println("--------TRANSACTION OF TRADER FROM DELHI-------");
		List<Transcation> FromDelhi=trans.stream().filter(P -> P.trader.getCity().equals("Delhi")).collect(Collectors.toList());	
		FromDelhi.forEach(System.out::println);
	}

}

