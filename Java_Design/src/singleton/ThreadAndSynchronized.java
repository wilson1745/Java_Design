package singleton;

public class ThreadAndSynchronized implements Runnable {

	private int num = 0;

	public ThreadAndSynchronized(int i) {
		this.num = i;
	}

	/*@Override
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Thread: " + num);
	}*/

	@Override
	public void run() {
		synchronized (ThreadAndSynchronized.class) {
			for (int i = 0; i < 5; i++)
				System.out.println("Thread: " + num);
		}
	}

	public static void main(String args[]) {
		ThreadAndSynchronized tas1 = new ThreadAndSynchronized(1);
		Thread t1 = new Thread(tas1, "Thread 1");
		ThreadAndSynchronized tas2 = new ThreadAndSynchronized(2);
		Thread t2 = new Thread(tas2, "Thread 2");
		t1.start();
		t2.start();
	}

}