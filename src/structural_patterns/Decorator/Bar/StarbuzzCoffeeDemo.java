package structural_patterns.Decorator.Bar;

public class StarbuzzCoffeeDemo {

	public static void main(String[] args) {
		
		Beverage beverage = new Expresso();
		
		System.out.println(beverage.getDescription() + " R$" + beverage.cost());
		
		Beverage beverage2 = new Expresso();
		
		beverage2 = new Chocolate( beverage2 );
		beverage2 = new Chocolate( beverage2 );
		beverage2 = new Soya( beverage2 );
		
		System.out.println(beverage2.getDescription() + " R$" + beverage2.cost());
		
		Beverage beverage3 = new Expresso();
		
		beverage3 = new Chocolate( beverage3 );
		beverage3 = new Soya( beverage3 );
		beverage3 = new Topping( beverage3 );
		
		System.out.println(beverage3.getDescription() + " R$" + beverage3.cost());
	}
}
