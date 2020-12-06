package composite_13.department;

/**
 * @description HumanResource.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class HumanResource extends Department {

	/**
	 * @param name
	 */
	public HumanResource(String name) {
		super(name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + "- provide adventurers as many as possible");
	}

}
