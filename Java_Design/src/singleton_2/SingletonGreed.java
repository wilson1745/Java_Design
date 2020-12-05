package singleton_2;

public class SingletonGreed {

	// 一開始即被建立
	private static SingletonGreed instance = new SingletonGreed();

	// 其他程式無法透過constructor來new物件
	private SingletonGreed() {

	}

	// 取得該class唯一的物件
	public static SingletonGreed getInstance() {
		return instance;
	}

}