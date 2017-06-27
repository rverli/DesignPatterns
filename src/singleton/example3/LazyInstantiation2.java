package singleton.example3;

import singleton.examples.Singleton;

public class LazyInstantiation2 {

	private volatile static LazyInstantiation2 uniqueInstance;
	
	private LazyInstantiation2() {}

	public static LazyInstantiation2 getInstance() { //THREAD-SAFE
		
		if (uniqueInstance == null) {
			
			synchronized (Singleton.class) {
				
				if (uniqueInstance == null) {
					uniqueInstance = new LazyInstantiation2();
				}
			}
		}
		return uniqueInstance;
	}
	
	//Data access methods
}