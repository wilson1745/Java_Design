package composite_13.association;

import java.util.ArrayList;
import java.util.List;

/**
 * @description Abstract Node
 *
 * @author wilso
 * @date 2020/12/06
 */
public class Association extends AbstractAssociation {

	private List<AbstractAssociation> branchs;

	/**
	 * @param name
	 */
	public Association(String name) {
		super(name);
		this.branchs = new ArrayList<>();
	}

	@Override
	public void add(AbstractAssociation a) {
		branchs.add(a);
	}

	@Override
	public void remove(AbstractAssociation a) {
		branchs.remove(a);
	}

	@Override
	public void display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);

		for (AbstractAssociation a : branchs) {
			a.display(depth + 2);
		}
	}

	@Override
	public void lineOfDuty() {
		for (AbstractAssociation a : branchs) {
			a.lineOfDuty();
		}
	}

}
