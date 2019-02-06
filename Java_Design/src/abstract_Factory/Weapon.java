package abstract_Factory;

public abstract class Weapon {

	protected int atk;
	protected int range;

	public void display() {
		System.out.print(this.getClass().getSimpleName() + " atk = " + atk + ", range = " + range);
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
}
