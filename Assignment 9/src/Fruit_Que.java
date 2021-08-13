import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruit{
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
}
public class Fruit_Que {

	public static void main(String[] args) {
		Fruit f1=new Fruit("Apple",100,120,"Red");
		Fruit f2=new Fruit("Guva",80,80,"Green");
		Fruit f3=new Fruit("Orange",50,150,"Orange");
		Fruit f4=new Fruit("Mango",70,250,"Yellow");
		Fruit f5=new Fruit("Lemon",50,10,"Yellow");
		Fruit f6=new Fruit("RedApple",50,200,"Red");
		Fruit f7=new Fruit("RedMango",50,250,"Red");
		
		List<Fruit> fruit=new ArrayList<>();
		fruit.add(f1);
		fruit.add(f2);
		fruit.add(f3);
		fruit.add(f4);
		fruit.add(f5);
		fruit.add(f6);
		fruit.add(f7);
		
		//Que1
		System.out.println("-----------LOW CALORIES FRUIT---------");
		fruit.stream().filter(P -> P.calories < 100).forEach(P-> System.out.println(P.name));
		
		//Que2
		System.out.println("-----------COLOR WISE FRUIT---------");
		List<Fruit> SortedColor=fruit.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList());
		SortedColor.forEach(System.out::println);
		
		//Que3
		System.out.println("-----------RED COLOR FRUIT---------");
		List<Fruit> RedColorFruit=fruit.stream().filter(P -> P.color=="Red").sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
		RedColorFruit.forEach(System.out::println);
	}

}
