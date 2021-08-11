import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Que8 extends Thread {
	public void run(){  
		System.out.println("thread is running...");  
		}  
	

	public static void main(String[] args) {
		Que8 t=new Que8();
		t.start();
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		Consumer<List<Integer>> print=list -> list.stream().forEach(a -> System.out.print(a + " "));
		  
		print.accept(numbers);
		
	}

}
