package structural_patterns.Decorator.Bar;

public class Soya extends CondimentDecorator {

	Beverage beverage;
	
	public Soya( Beverage beverage ) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Soya";
	}

	@Override
	public Double cost() {
		return .35 + this.beverage.cost();
	}
}
