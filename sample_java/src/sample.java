interface Vehicle{
	default void start() {
		System.out.println("Vehicle is started");
	}
}
interface Car{
	default void start() {
		System.out.println("car is started");
		
	}
}
class mercedes implements Car,Vehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Vehicle.super.start();
		Car.super.start();
	}	
}
public class sample {

	public static void main(String[] args) {
		mercedes m1=new mercedes();
		m1.start();
	}
}
