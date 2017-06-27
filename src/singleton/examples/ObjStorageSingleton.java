package singleton.examples;

public class ObjStorageSingleton {
	
	private int quantity = 0;
	
	private ObjStorageSingleton() {	}
	
	private static final ObjStorageSingleton instance = new ObjStorageSingleton();
	
	public static ObjStorageSingleton getInstance() {
		return instance;
	}
	
	public synchronized void addObj( int qtd ) {
		quantity += qtd;
	}
	
	public synchronized boolean removeObj( int qtd ) {
		
		if (quantity < qtd) {
			return false;
		}
		
		quantity -= qtd;
		
		return true;
	}
	
	public synchronized int getObjQuantity() {
		return quantity;
	}
}
