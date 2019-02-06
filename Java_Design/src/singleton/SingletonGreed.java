package singleton;

public class SingletonGreed {

	// 一開始就建立物件，這樣只要一直回傳這個物件就是簡單的singleton
	private static SingletonGreed instance = new SingletonGreed();

	// private constructor，這樣其他物件就沒辦法直接用new來取得新的實體
	private SingletonGreed() {

	}

	// 因為constructor已經private，所以需要另外提供方法讓其他程式調用這個類別
	public static SingletonGreed getInstance() {
		return instance;
	}
}