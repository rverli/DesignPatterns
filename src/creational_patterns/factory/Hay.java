package creational_patterns.factory;

public class Hay extends Food {
	
	public Hay( int quantity ) {
		super(quantity);
	}
	
	@Override
	public void consumer() {
		System.out.println("Hay eaten: " + super.getQuantity());
	}
}
