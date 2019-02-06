package singleton;

public class SingletonGreed {

	// һ�_ʼ�ͽ���������@��ֻҪһֱ�؂��@��������Ǻ��ε�singleton
	private static SingletonGreed instance = new SingletonGreed();

	// private constructor���@����������͛]�k��ֱ����new��ȡ���µČ��w
	private SingletonGreed() {

	}

	// ���constructor�ѽ�private��������Ҫ�����ṩ����׌������ʽ�{���@��e
	public static SingletonGreed getInstance() {
		return instance;
	}
}