package creational_patterns.singleton.example3;

public class LazyInstantiation {

	private static LazyInstantiation uniqueInstance;
	
	private LazyInstantiation() {
	}

	public static LazyInstantiation getInstance() { //NOT THREAD-SAFE
		
		if (uniqueInstance == null) {
			uniqueInstance = new LazyInstantiation(); 
		}
		
		return uniqueInstance;
	}
	
	//Data access methods
}
