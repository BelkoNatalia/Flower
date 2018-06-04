package Entity;

public class Flower {
	
	private int id;
	private String name;
	private String colourBud;
	private double lenghtStem;
	private String tipeLeaves;
	private int dataCatFlower;
	private double cost;
	
	
	public Flower (){
		
	}
	
	public Flower (int id, String name, String colourBud ){
		this.id = id;
		this.name = name;
		this.colourBud = colourBud;
		
	}
	public Flower (int id, String name, String colourBud, double lenghtStem, String tipeLeaves, int dataCatFlower ){
		this.id = id;
		this.name = name;
		this.colourBud = colourBud;
		this.lenghtStem = lenghtStem;
		this.tipeLeaves = tipeLeaves;
		this.dataCatFlower = dataCatFlower;
		
	}
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColourBud() {
		return colourBud;
	}

	public void setColourBud(String colourBud) {
		this.colourBud = colourBud;
	}

	public double getLenghtStem() {
		return lenghtStem;
	}

	public void setLenghtStem(double lenghtStem) {
		this.lenghtStem = lenghtStem;
	}

	public String getTipeLeaves() {
		return tipeLeaves;
	}

	public void setTipeLeaves(String tipeLeaves) {
		this.tipeLeaves = tipeLeaves;
	}

	public int getDataCatFlower() {
		return dataCatFlower;
	}

	public void setDataCatFlower(int dataCatFlower) {
		this.dataCatFlower = dataCatFlower;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	

}
