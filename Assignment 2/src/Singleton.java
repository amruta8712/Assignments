public class Singleton {
	
	private static Singleton singletonObject;  
	
	public String message;
	
	private Singleton()   
	{
		message="Singleton: ";
	}
	
	public static Singleton getInstance()   
	{
		if(singletonObject==null)
		{
			singletonObject = new Singleton();
		}
		return singletonObject;
	}

	public static void main(String args[])
	{
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		Singleton obj3=Singleton.getInstance();
		Singleton obj4=Singleton.getInstance();
		
		System.out.println(obj1.message +"Object 1");
		System.out.println(obj2.message +"Object 2");
		System.out.println(obj3.message +"Object 3");
		System.out.println(obj4.message +"Object 4");
		
		System.out.println("");
		
		obj3.message = (obj3.message).toUpperCase(); 
		
		
		System.out.println(obj1.message +"Object 1");
		System.out.println(obj2.message +"Object 2");
		System.out.println(obj3.message +"Object 3");
		System.out.println(obj4.message +"Object 4");
			
	}

}