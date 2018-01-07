package creational_patterns.builder;

import java.util.Arrays;

import creational_patterns.immutable_objects.Animal;

public class BuilderTest {

	public BuilderTest() {
		
		AnimalBuilder duckBuilder = new AnimalBuilder();
		
		duckBuilder
			.setAge(4)
			.setSpecies("duck")
			.setFavoriteFoods( Arrays.asList("grass", "fish") );
		
		@SuppressWarnings("unused")
		Animal duck = duckBuilder.build();
		
		//########################################
		
		@SuppressWarnings("unused")
		Animal flamingo = new AnimalBuilder()
									.setAge(12)
									.setSpecies("flamingo")
									.setFavoriteFoods(Arrays.asList("algae", "insects"))
									.build();
		
		//########################################
		
		 // This is the Car type that I can order at the car reseller
	    final Car toyota = 
	    		new Car.Builder("Toyota", "Avensis")
	    		.withPower(108)
	    		.withTorque(180)
	    		.withGears(6)
	    		.build();

	    // I want a Black Car!
	    final Car myNewCar = 
	    		toyota
	    		.toBuilder()
	    		.withColor("Black")
	    		.build();
	    
	   //########################################
	    
	    Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
		
	}

}
