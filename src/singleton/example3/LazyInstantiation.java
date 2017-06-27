package singleton.example3;

public class LazyInstantiation {

	private static LazyInstantiation uniqueInstance;
	
	public LazyInstantiation() {
	}

	public static LazyInstantiation getInstance() {
		
		if (uniqueInstance == null) {
			uniqueInstance = new LazyInstantiation(); //NOT THREAD-SAFE
		}
		
		return uniqueInstance;
	}
	
	//Data access methods
}
