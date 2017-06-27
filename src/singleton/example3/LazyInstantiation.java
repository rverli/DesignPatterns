package singleton.example3;

public class LazyInstantiation {

	private static LazyInstantiation instance;
	
	public LazyInstantiation() {
	}

	public static LazyInstantiation getInstance() {
		
		if (instance == null) {
			instance = new LazyInstantiation(); //NOT THREAD-SAFE
		}
		
		return instance;
	}
	
	//Data access methods
}
