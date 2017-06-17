package Decorator.Bar;

public class Chocolate extends CondimentDecorator {
	
	Beverage beverage;
	
	public Chocolate( Beverage beverage ) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Chocolate";
	}

	@Override
	public Double cost() {
		return .20 + this.beverage.cost();
	}
}
