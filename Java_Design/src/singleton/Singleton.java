package singleton;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		// �@�e���ܺ��˶�code�����������Ҫ���M�ܶ��YԴ
	}

	/*public static Singleton getInstance() {
		// ��һ�α����еĕr���ٽ������
		if (instance == null) {
			instance = new Singleton();
		}
	
		return instance;
	}*/

	/*// �����оw�rʹ��synchronized���CSingletonһ���ǆ�һ��
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
	
		return instance;
	}*/

	// �����оw�r���������Ҫ�������r��ʹ��synchronized���CSingletonһ���ǆ�һ�� �����ӳ�ʽУ��
	public static Singleton getInstance() {
		if (instance == null) {
			//���ӳ�ʽУ��
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}