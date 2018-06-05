package entity.flower.typeFlower;

import entity.flower.Flower;

public class SunFlower extends Flower{
	private double diametr;

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}

	public SunFlower(String name, String colour, double lenghtStem, int freshness, double cost, double diametr) {
		super(name, colour, lenghtStem, freshness, cost);
		this.diametr = diametr;
	}

}
