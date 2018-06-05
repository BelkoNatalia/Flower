package Run;

import entity.flower.typeFlower.Rose;
import entity.flower.typeFlower.SunFlower;
import entity.flower.typeFlower.Tulip;
import entity.accessory.typeAccessory.Bead;
import entity.accessory.typeAccessory.Tape;
import entity.florist.Florist;
import entity.flower.Flower;
import entity.accessory.Accessories;

public class Run {

	public static void main(String[] args) {
		Rose rose1 = new Rose("African", "red", 35, 1, 5, true);
		Rose rose2 = new Rose("Rusian", "blue", 50, 5, 10, false);
		Tulip tulip1 = new Tulip("Rusian_Tulip", "yellow", 40, 2, 2);
		SunFlower sunFlower1 = new SunFlower("Rusian_Tulip", "yellow", 40, 2, 2, 25);
		Flower[] myFlowers = {rose1, rose2, tulip1, sunFlower1};

		Bead bead1 = new Bead("GTR", 3, 16, "steel");
		Tape tape1 = new Tape("NH28", 10, 1, "blue");
		Accessories[] myAccessories = {bead1, tape1};
		
		
		Florist florist1 = new Florist(myFlowers, myAccessories);
		
		double priceForMyFlorist1 = florist1.getPrice();
		Flower flowerByLengthRange = florist1.getFlowerByLengthRange(20, 60);
		
		System.out.println("Price for my florist: " + priceForMyFlorist1 + "$;");
		System.out.println("Flower by length rang: " + flowerByLengthRange);
	}
}
