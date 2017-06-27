package creational_patterns.immutable_objects;

import java.util.List;

public final class Animal {

	private final String species;
	private final int age;
	private final List<String> favoriteFoods;

	public Animal( String species, int age, List<String> favoriteFoods ) {
		
		this.species = species;
		this.age = age;
		
		if ( favoriteFoods == null ) {
			throw new RuntimeException("favorite food is required!");
		}
		this.favoriteFoods = favoriteFoods;
	}
	
	public String geSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}
	
	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}
	
	public String getFavoriteFood( int index ) {
		return favoriteFoods.get(index);
	}
}
