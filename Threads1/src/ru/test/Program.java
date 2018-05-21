package ru.test;

class MyThread implements Runnable{
	private Thread thrd;
	
	public void setThread(Thread thrd) {
		this.thrd = thrd;
	}
	
	public Thread getThread() {
		return this.thrd;
	}
	
	MyThread(String name) {
		setThread(new Thread(this,name));
		getThread().start();
	}

	@Override
	public void run() {
		System.out.println(getThread().getName() + " - запуск");
		try {
			for(int count=0; count<10; count++) {
				Thread.sleep(400);
				System.out.println("В " + getThread().getName() + ", счетчик: " + count);
			}
		}
		catch(InterruptedException exc) {
			System.out.println(getThread().getName() + " - прерван");
		}
		System.out.println(getThread().getName() + " завершение");	
	}
}

public class Program {

	public static void main(String[] args) {
		System.out.println("Запуск основного потока");
		
		MyThread mt = new MyThread("Child #1");
		
		for (int i=0; i<50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException exc) {
				System.out.println("Прерывание основного потока");
			}
		}
		
		
		System.out.println("Завершение основного потока");

	}

}
