package creational_patterns.singleton.example3;

public class LazyInstantiation2 {

	private volatile static LazyInstantiation2 uniqueInstance;
	
	private LazyInstantiation2() {}

	public static LazyInstantiation2 getInstance() { //THREAD-SAFE
		
		if (uniqueInstance == null) {
			
			synchronized (LazyInstantiation2.class) {
				
				if (uniqueInstance == null) {
					uniqueInstance = new LazyInstantiation2();
				}
			}
		}
		return uniqueInstance;
	}
	
	//Data access methods
}