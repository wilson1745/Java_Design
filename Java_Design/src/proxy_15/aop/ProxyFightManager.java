package proxy_15.aop;

import java.util.Date;

/**
 * @description ProxyFightManager.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class ProxyFightManager extends FightManager {

	private FightManager source;

	public ProxyFightManager(FightManager source) {
		this.source = source;
	}

	public void doFight(String userName) {
		// Just for the record, nothing to do with the fight
		System.out.println("> Time start at " + new Date().toLocaleString());
		source.doFight(userName);
	}

}
