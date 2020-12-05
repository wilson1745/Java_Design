package singleton_2;

/**
 * @description 單例模式測試
 * 
 * @author Wilson
 * @date 2020年10月9日
 */
public class SingletonTest extends Thread {

	String myId;

	public SingletonTest(String id) {
		myId = id;
	}

	public void run() {
		// Singleton singleton = Singleton.getInstance();
		Singleton singleton = Singleton.getSynInstance();

		if (singleton != null) {
			// 用hashCode判斷是否為同一個Singleton
			System.out.println(myId + " 產生 Singleton: " + singleton.hashCode());
		}
	}

	public static void main(String[] argv) {

		// Greed Singleton
		SingletonGreed singletonGreed1 = SingletonGreed.getInstance();
		SingletonGreed singletonGreed2 = SingletonGreed.getInstance();
		System.out.println("singletonGreed1: " + singletonGreed1.hashCode());
		System.out.println("singletonGreed2: " + singletonGreed2.hashCode());
		System.out.println();

		// Singleton
		// Singleton singleton1 = Singleton.getInstance();
		// Singleton singleton2 = Singleton.getInstance();
		// System.out.println("singleton1: " + singleton1.hashCode());
		// System.out.println("singleton2: " + singleton2.hashCode());
		// System.out.println();

		// Can possibly get 2 different Singleton
		Thread t1 = new SingletonTest("Thread1");
		Thread t2 = new SingletonTest("Thread2");

		// the Java Virtual Machine calls the "run" method of this thread
		t1.start();
		t2.start();
	}

}