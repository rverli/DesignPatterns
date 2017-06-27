package structural_patterns.Decorator.Bar;

public abstract class Beverage {

	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract Double cost();
}
