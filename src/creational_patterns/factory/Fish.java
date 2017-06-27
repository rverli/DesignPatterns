package creational_patterns.factory;

public class Fish extends Food {
	
	public Fish( int quantity ) {
		super(quantity);
	}
	
	@Override
	public void consumer() {
		System.out.println("Fish eaten: " + super.getQuantity());
	}
}
