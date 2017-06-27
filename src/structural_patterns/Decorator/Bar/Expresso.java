package structural_patterns.Decorator.Bar;

public class Expresso extends Beverage {

	public Expresso() {
		description = "Expresso";
	}

	@Override
	public Double cost() {
		
		return 1.99;
	}

}
