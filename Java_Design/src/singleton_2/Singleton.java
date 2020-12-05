package singleton_2;

public class Singleton {

	// 先宣告但不先建立物件
	private static Singleton instance;

	private Singleton() {
		// 假設這裡需要花費很多資源
	}

	public static Singleton getInstance() {
		// 物件尚未被建立就new產生
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// Using synchronized to make sure there is one Singleton calling by different Threads
	// public static synchronized Singleton getSynInstance() {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// return instance;
	// }
	public static Singleton getSynInstance() {
		if (instance == null) {
			// speed the process
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}

}