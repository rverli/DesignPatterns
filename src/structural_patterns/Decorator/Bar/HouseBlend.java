package structural_patterns.Decorator.Bar;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee!";
	}

	@Override
	public Double cost() {
		
		return .89;
	}

}
