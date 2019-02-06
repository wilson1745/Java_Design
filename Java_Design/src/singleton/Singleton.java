package singleton;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		// 這裡面跑很了多code，建立物件需要花費很多資源
	}

	/*public static Singleton getInstance() {
		// 第一次被呼叫的時候再建立物件
		if (instance == null) {
			instance = new Singleton();
		}
	
		return instance;
	}*/

	/*// 多執行緒時使用synchronized保證Singleton一定是單一的
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
	
		return instance;
	}*/

	// 多執行緒時，當物件需要被建立時才使用synchronized保證Singleton一定是單一的 ，增加程式校能
	public static Singleton getInstance() {
		if (instance == null) {
			//增加程式校能
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}