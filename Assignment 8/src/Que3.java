import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Que3 {

	public static void main(String[] args) {
		
		//functional interface Supplier
		//contains only get() method
		Supplier<Double> randomValue=()-> Math.random();
		System.out.println("Value given by supplier interface :"+randomValue.get());
		
		//functional interface Consumer
		//contains only accept(T t) method
		Consumer<Integer> display=a -> System.out.println(a);
		display.accept(100);
		
		//functional interface Predicate
		//test(T t)
		Predicate<Integer> compare=i -> (i<15);
		System.out.println("compares number is less than 15 :" + compare.test(10));
		
		//Functional interface Function
		//R apply(T t)
		//andThen()
		Function<Integer, Double> half= a -> a/2.0;
		half=half.andThen(a->a*3.0);
		System.out.println(half.apply(10));

	}

}
