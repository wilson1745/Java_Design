package simple_Factory;

//Archer (ConcreteProduct)
public class Archer implements Adventurer {

	@Override
	public String getType() {
		System.out.println("I'm an archer");
		return this.getClass().getSimpleName(); //return "Archer"
	}

}
