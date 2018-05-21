package ru.egorka;

public class Program {

	public static void main(String[] args) {
		System.out.println("Начало потока "+ Thread.currentThread().getName());
		
		MyThread m1 = new MyThread("FirstP");
		MyThread m2 = new MyThread("SecondP");
		MyThread m3 = new MyThread("ThirdP");
		MyThread m4 = new MyThread("FourthP");
		
		m1.getThread().setPriority(3);
		m2.getThread().setPriority(9);
		m3.getThread().setPriority(5);
		m4.getThread().setPriority(1);
		
		try {
			m1.getThread().join();
			System.out.printf("Поток %s к потоку %s присоединен!\n",m1.getThread().getName(), Thread.currentThread().getName());
			m2.getThread().join();
			System.out.printf("Поток %s к потоку %s присоединен!\n",m2.getThread().getName(), Thread.currentThread().getName());
			m3.getThread().join();
			System.out.printf("Поток %s к потоку %s присоединен!\n",m3.getThread().getName(), Thread.currentThread().getName());
			m4.getThread().join();
			System.out.printf("Поток %s к потоку %s присоединен!\n",m4.getThread().getName(), Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Окончание потока "+ Thread.currentThread().getName());
	}

}
