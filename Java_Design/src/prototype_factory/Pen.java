package prototype_factory;

/* 
 * @description:抽象原型角色
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
	
}
