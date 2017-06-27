package singleton.examples;

public class ObjTrainer {

	public boolean useObject( int numberOfInstances ) {
		
		int qtdNeeded = 5 * numberOfInstances;
		
		ObjStorageSingleton singleton = ObjStorageSingleton.getInstance();
		
		if ( singleton.getObjQuantity() > qtdNeeded ) {
			singleton.addObj( qtdNeeded + 10 );
		}
		
		boolean use = singleton.removeObj( qtdNeeded );
		
		if (use) {
			System.out.println("Instances have been used");
		}
		
		return use;
	}
	
}
