package strategy_6.village;

public class Village {

	public int id;
	public String name;
	public int population;
	public double area;

	public Village(int id, String name, int population, double area) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.area = area;
	}

	@Override
	public String toString() {
		return id + ". " + name + " (Population: " + population + ", Area: " + area + ")";
	}

}
