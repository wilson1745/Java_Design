package prototype_factory;

/* 
 * @description:��H�쫬����
 * */ 
public abstract class Pen implements Cloneable {
	
	private String name;

	public Pen(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
