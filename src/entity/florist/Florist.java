package entity.florist;

import entity.accessory.Accessories;
import entity.flower.Flower;

public class Florist {
	private Flower[] flowers;
	private Accessories[] accessories;
	private double price = 0;
	
	public Florist(Flower[] flowers, Accessories[] accessories) {
		this.flowers = flowers;
		this.accessories = accessories;
	}
	
	public double getPrice() {
		for (int i = 0; i < flowers.length; i++) {
			price = price + flowers[i].getCost();
		}

		for (int i = 0; i < accessories.length; i++) {
			price = price + accessories[i].getCost();
		}
		return price;
	}
	
	public Flower getFlowerByLengthRange(int startLength, int endLength) {
		Flower flower = null;
		for (int i = 0; i < flowers.length; i++) {
			double length = flowers[i].getLenghtStem();
			if(length >= startLength && length <= endLength) {
				flower = flowers[i];
			}
		}
		return flower;
	}

}
