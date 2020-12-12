package proxy_15.protectproxy;

/**
 * @description PersonBean.java
 *
 * @author wilso
 * @date 2020/12/12
 */
public class PersonBean implements Person {

	private String name;

	private int likeCount;

	@Override
	public void setLikeCount(int like) {
		this.likeCount = like;
	}

	@Override
	public int getLikeCount() {
		return likeCount;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
