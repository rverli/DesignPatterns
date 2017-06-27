package singleton.example3;

import singleton.examples.Singleton;

public class LazyInstantiation {

	private volatile static LazyInstantiation uniqueInstance;
	
	private LazyInstantiation() {}

	public static LazyInstantiation getInstance() {
		
		if (uniqueInstance == null) {
			
			synchronized (Singleton.class) {
				
				if (uniqueInstance == null) {
					uniqueInstance = new LazyInstantiation();
				}
			}
		}
		return uniqueInstance;
	}
	
	//Data access methods
}
