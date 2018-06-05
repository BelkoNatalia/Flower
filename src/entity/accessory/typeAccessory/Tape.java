package entity.accessory.typeAccessory;

import entity.accessory.Accessories;

public class Tape extends Accessories {
	private double lenght;
	private String colour;

	public Tape(String name, double cost, double lenght, String colour) {
		super(name, cost);
		this.lenght = lenght;
		this.colour = colour;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
