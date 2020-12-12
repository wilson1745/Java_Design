package proxy_15.protectproxy;

/**
 * @description Ex: Make setLikeCount() untouchable
 *
 * @author wilso
 * @date 2020/12/12
 */
public class ProxyPersonBean implements Person {

	PersonBean person;

	public ProxyPersonBean(PersonBean person) {
		this.person = person;
	}

	/**
	 * Let's assume that user cannot set the likeCount.
	 */
	@Override
	public void setLikeCount(int like) {
		System.out.println("Not authorized to set the variable likeCount!");
	}

	@Override
	public int getLikeCount() {
		return person.getLikeCount();
	}

	@Override
	public String getName() {
		return person.getName();
	}

	@Override
	public void setName(String name) {
		person.setName(name);
	}

}
