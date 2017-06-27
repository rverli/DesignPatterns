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
	}

}
