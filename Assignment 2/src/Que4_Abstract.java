abstract class abstractTest{
	abstract void abstractmethod();
}

class subclass extends abstractTest{

	@Override
	void abstractmethod() {
		System.out.println("This is abstract method of abstractTest class which is overriden in subclass");	
	}
	
}
public class Que4_Abstract {

	public static void main(String[] args) {
		abstractTest SC=new subclass();
		SC.abstractmethod();
	}

}
