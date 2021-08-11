
interface operation{
	public int perform(int a,int b);
	}
public class Que1 {

	public static void main(String[] args) {
		
		//Addition Operation
		operation add=(a,b)->(a+b);
		System.out.println("Addition is "+add.perform(10, 20));
		
		//Subtraction Operation
		operation sub=(a,b)->(a-b);
		System.out.println("Subtraction is "+sub.perform(20, 10));
		
		//Multiplication operation
		operation mul=(a,b)->(a*b);
		System.out.println("Multiplication is "+mul.perform(20, 10));
		
		//Division opeartion
		operation div=(a,b)->(a/b);
		System.out.println("Division is "+div.perform(20, 5));

	}

}