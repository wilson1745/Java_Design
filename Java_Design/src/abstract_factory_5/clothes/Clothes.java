package abstract_factory_5.clothes;

public abstract class Clothes {

	protected int def;

	public void display() {
		System.out.print(" " + this.getClass().getSimpleName() + " def: " + def);
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

}
