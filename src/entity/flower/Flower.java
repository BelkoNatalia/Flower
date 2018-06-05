package entity.flower;

public class Flower {
	
	private String name;
	private String colour;
	private double lenghtStem;
	private int freshness;
	private double cost;
	
	public Flower (){
		
	}
	
	public Flower (String name, String colour, double lenghtStem ){
		this.name = name;
		this.colour = colour;
		this.lenghtStem = lenghtStem;
	}
	
	public Flower (String name, String colour, double lenghtStem, int freshness, double cost){
		this(name, colour, lenghtStem);
		this.freshness = freshness;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getLenghtStem() {
		return lenghtStem;
	}

	public void setLenghtStem(double lenghtStem) {
		this.lenghtStem = lenghtStem;
	}

	public int getFreshness() {
		return freshness;
	}

	public void setfreshness(int freshness) {
		this.freshness = freshness;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", colour=" + colour + ", lenghtStem=" + lenghtStem + "cm, freshness=" + freshness
				+ "day(s), cost=" + cost + "$]";
	}
	
}
