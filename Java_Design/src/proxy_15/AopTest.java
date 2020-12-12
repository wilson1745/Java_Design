package proxy_15;

import org.junit.Test;

import proxy_15.aop.FightManager;
import proxy_15.aop.ProxyFightManager;

/**
 * @description AopTest.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class AopTest {

	@Test
	public void test() {
		System.out.println("Without proxy");
		FightManager fm = new FightManager();
		fm.doFight("ShitTheMan");
		System.out.println();

		System.out.println("With proxy");
		FightManager fmProxy = new ProxyFightManager(fm);
		fmProxy.doFight("ShitTheMan");
	}

}
