package entity.flower.typeFlower;

import entity.flower.Flower;

public class Rose extends Flower {
	private boolean spike;
	
	public Rose(String name, String colour, double lenghtStem, int freshness, double cost, boolean spike) {
		super(name, colour, lenghtStem, freshness, cost);
		this.spike = spike;
	}
	 
	public boolean getSpike() {
		return spike;
	}
	
	public void setSpike(boolean spike) {
		this.spike = spike;
	}
}
