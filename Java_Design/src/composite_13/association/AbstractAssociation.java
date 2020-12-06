package composite_13.association;

/**
 * @description AbstractAssociation.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public abstract class AbstractAssociation {

	protected String name;

	public AbstractAssociation(String name) {
		this.name = name;
	}

	public abstract void add(AbstractAssociation a);

	public abstract void remove(AbstractAssociation a);

	public abstract void display(int depth);

	public abstract void lineOfDuty();

}
