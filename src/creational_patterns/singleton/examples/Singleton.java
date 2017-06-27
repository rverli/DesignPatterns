package creational_patterns.singleton.examples;

public class Singleton {
	
	private int quantity = 0;
	
	private Singleton() {	}
	
	private static final Singleton uniqueInstance = new Singleton();
	
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	public synchronized void addInstance( int qtd ) {
		quantity += qtd;
	}
	
	public synchronized boolean removeInstance( int qtd ) {
		
		if (quantity < qtd) {
			return false;
		}
		
		quantity -= qtd;
		
		return true;
	}
	
	public synchronized int getInstanceQuantity() {
		return quantity;
	}
}
