package com.psl.demo;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Thread.currentThread().getName().equals("one")) {
				System.out.println(2 * i);
			} else {
				System.out.println(5 * i);
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Inside main");
		ThreadDemo obj = new ThreadDemo();
		Thread t1 = new Thread(obj, "one");
		Thread t2 = new Thread(obj, "two");

		t1.start();
		t1.setPriority(1);

/*		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
		t2.setPriority(10);
/*		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("End Main");
	}

}
