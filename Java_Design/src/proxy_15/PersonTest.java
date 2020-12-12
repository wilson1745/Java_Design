package proxy_15;

import org.junit.Test;

import proxy_15.protectproxy.Person;
import proxy_15.protectproxy.PersonBean;
import proxy_15.protectproxy.ProxyPersonBean;

/**
 * @description PersonTest.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class PersonTest {

	@Test
	public void test() {
		System.out.println("Without proxy");
		Person realPerson = new PersonBean();
		realPerson.setLikeCount(10);
		System.out.println("realPerson likeCount: " + realPerson.getLikeCount());
		System.out.println();

		System.out.println("With proxy");
		Person proxyPerson = new ProxyPersonBean(new PersonBean());
		// User cannot set the likeCount
		proxyPerson.setLikeCount(10);
		System.out.println("proxyPerson likeCount: " + proxyPerson.getLikeCount());
	}

}
