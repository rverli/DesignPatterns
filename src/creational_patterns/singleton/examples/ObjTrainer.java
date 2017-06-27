package creational_patterns.singleton.examples;

public class ObjTrainer {

	public boolean useObject( int numberOfInstances ) {
		
		int qtdNeeded = 5 * numberOfInstances;
		
		Singleton singleton = Singleton.getInstance();
		
		if ( singleton.getInstanceQuantity() > qtdNeeded ) {
			singleton.addInstance( qtdNeeded + 10 );
		}
		
		boolean use = singleton.removeInstance( qtdNeeded );
		
		if (use) {
			System.out.println("Instances have been used");
		}
		
		return use;
	}
	
}
