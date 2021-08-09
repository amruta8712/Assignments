abstract class persistance{
	abstract void persist();
}

class FilePersistance extends persistance{

	@Override
	void persist() {
		System.out.println("persist method is implemented in FilePersistance subclass");	
	}	
}

class DatabasePersistance extends persistance{

	@Override
	void persist() {
		System.out.println("persist method is implemented in DatabasePersistance subclass");
	}	
}

public class Que6_Persistance {

	public static void main(String[] args) {
		
		persistance FP=new FilePersistance();
		persistance DP=new DatabasePersistance();
		
		FP.persist();
		DP.persist();

	}
}
