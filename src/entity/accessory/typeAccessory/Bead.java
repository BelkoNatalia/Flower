package entity.accessory.typeAccessory;

import entity.accessory.Accessories;

public class Bead extends Accessories {
	private double diametr;
	private String material;

	public Bead(String name, double cost, double diametr, String material) {
		super(name, cost);
		this.diametr = diametr;
		this.material = material;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
