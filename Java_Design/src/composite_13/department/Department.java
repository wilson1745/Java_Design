package composite_13.department;

import composite_13.association.AbstractAssociation;

/**
 * @description Leaf
 *
 * @author wilso
 * @date 2020/12/06
 */
public abstract class Department extends AbstractAssociation {

	/**
	 * @param name
	 */
	public Department(String name) {
		super(name);
	}

	@Override
	public void add(AbstractAssociation a) {
		System.out.println("Leaf has no node(association) to be added");
	}

	@Override
	public void remove(AbstractAssociation a) {
		System.out.println("Leaf has no node(association) to be removed");
	}

	@Override
	public void display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
	}

	/** The department hasn't decided the task yet. */
	@Override
	abstract public void lineOfDuty();

}
