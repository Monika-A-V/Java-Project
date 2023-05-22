package Final_Test_Paper_1;


class MyThread extends Thread {
	MyThread() {
		System.out.print(" MyThread");
	}
	public void run() {
		System.out.print(" bar");
	}
}
public class Q13 {

	public static void main(String[] args) {

		Thread t = new MyThread() {
			public void run() {
				System.out.println(" foo");
			}
		};
		t.start();
	}
}
