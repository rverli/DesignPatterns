package structural_patterns.Decorator.Bar;

public class Topping extends CondimentDecorator {

	Beverage beverage;
	
	public Topping( Beverage beverage ) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Topping";
	}

	@Override
	public Double cost() {
		return .87 + this.beverage.cost();
	}
}
