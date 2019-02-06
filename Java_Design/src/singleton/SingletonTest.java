package singleton;

/*
 * ����ģʽ Singleton
 * Ŀ�ģ����Cһ��eֻ���a��һ�����������Ҫ�ṩ��ȡԓ����Ľyһ����
 * */

public class SingletonTest extends Thread {

	String myId;

	public SingletonTest(String id) {
		myId = id;
	}

    // ���оw���еĕr���ȥ����Singleton.getInstance()
	public void run() {
		Singleton singleton = Singleton.getInstance();

		if (singleton != null) {
            // ��hashCode�Д�ǰ��ɴ�ȡ����Singleton����Ƿ��ͬһ��
			System.out.println(myId + "�a�� Singleton:" + singleton.hashCode());
		}
	}

	public static void main(String[] argv) {
		// �Έ��оw�ĕr��s1�cs2�_����ͬһ�����
		/*
		 * Singleton s1 = Singleton.getInstance(); 
		 * Singleton s2 = Singleton.getInstance(); 
		 * System.out.println("s1:" + s1.hashCode() + " s2:" + s2.hashCode()); 
		 * System.out.println();
		 */

        // �ɂ����оwͬ�r����
		Thread t1 = new SingletonTest("���оwT1");
		Thread t2 = new SingletonTest("���оwT2");
		t1.start(); // �_ʼ����t1.run()
		t2.start();
	}
}