package composite_13.department;

/**
 * @description ServieDepartment.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class ServiceDepartment extends Department {

	/**
	 * @param name
	 */
	public ServiceDepartment(String name) {
		super(name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + "- we will not commit the disaster");
	}

}
