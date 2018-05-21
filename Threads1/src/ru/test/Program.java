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
		System.out.println(getThread().getName() + " - ������");
		try {
			for(int count=0; count<10; count++) {
				Thread.sleep(400);
				System.out.println("� " + getThread().getName() + ", �������: " + count);
			}
		}
		catch(InterruptedException exc) {
			System.out.println(getThread().getName() + " - �������");
		}
		System.out.println(getThread().getName() + " ����������");	
	}
}

public class Program {

	public static void main(String[] args) {
		System.out.println("������ ��������� ������");
		
		MyThread mt = new MyThread("Child #1");
		
		for (int i=0; i<50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException exc) {
				System.out.println("���������� ��������� ������");
			}
		}
		
		
		System.out.println("���������� ��������� ������");

	}

}
