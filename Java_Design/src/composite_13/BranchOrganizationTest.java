package composite_13;

import java.util.logging.Logger;

import org.junit.Test;

import composite_13.association.AbstractAssociation;
import composite_13.association.Association;
import composite_13.department.HumanResource;
import composite_13.department.ServiceDepartment;

/**
 * @description BranchOrganizationTest.java
 *
 * @author wilso
 * @date 2020/12/06
 */
public class BranchOrganizationTest {

	Logger logger = Logger.getLogger(BranchOrganizationTest.class.getSimpleName());

	private static final String HEAD_ASSO = "Headquarter of Adventurer";
	private static final String MARS_ASSO = "Mars";
	private static final String SATURN_ASSO = "Saturn";
	private static final String S1_ASSO = "Saturn_1";
	private static final String S2_ASSO = "Saturn_2";

	@Test
	public void test() {
		logger.info("====Start Composite Design====");

		AbstractAssociation root = new Association(HEAD_ASSO);
		root.add(new HumanResource(HEAD_ASSO + " " + HumanResource.class.getSimpleName()));
		root.add(new ServiceDepartment(HEAD_ASSO + " " + ServiceDepartment.class.getSimpleName()));

		AbstractAssociation mars = new Association(MARS_ASSO);
		mars.add(new HumanResource(MARS_ASSO + " " + HumanResource.class.getSimpleName()));
		mars.add(new ServiceDepartment(MARS_ASSO + " " + ServiceDepartment.class.getSimpleName()));
		root.add(mars);

		AbstractAssociation saturn = new Association(SATURN_ASSO);
		saturn.add(new HumanResource(SATURN_ASSO + " " + HumanResource.class.getSimpleName()));
		saturn.add(new ServiceDepartment(SATURN_ASSO + " " + ServiceDepartment.class.getSimpleName()));
		root.add(saturn);

		AbstractAssociation s1 = new Association(S1_ASSO);
		s1.add(new HumanResource(S1_ASSO + " " + HumanResource.class.getSimpleName()));
		s1.add(new ServiceDepartment(S1_ASSO + " " + ServiceDepartment.class.getSimpleName()));
		saturn.add(s1);

		AbstractAssociation s2 = new Association(S2_ASSO);
		s2.add(new ServiceDepartment(S2_ASSO + " " + ServiceDepartment.class.getSimpleName()));
		saturn.add(s2);

		logger.info("Display Organizations: ");
		root.display(1);

		logger.info("Line of Duty: ");
		root.lineOfDuty();
	}

}
