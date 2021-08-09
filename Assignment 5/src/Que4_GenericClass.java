class Pair<K,V>{
	private K key;
	private V value;
	/*public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}*/
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}
public class Que4_GenericClass {

	public static void main(String[] args) {
		//first scenario Que 4 a)
		Pair<String,String> P1=new Pair<>();
		P1.setKey("1");
		P1.setValue("Hello");
		System.out.println("For first pair Key is "+P1.getKey()+" and value is "+P1.getValue());
		
		//Second scenario Que 4 b)
		Pair<String,java.util.Date> P2=new Pair<>();
		P2.setKey("Today is ");
		P2.setValue(new java.util.Date());
		System.out.println("For Second pair Key is "+P2.getKey()+" and value is "+P2.getValue());
	}
}
