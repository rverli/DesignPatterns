package creational_patterns.factory;

public class ZooKepper {

	public static void main(String[] args) {

		final Food food = FoodFactory.getFood("zebra");
		
		food.consumer();
	}
}
