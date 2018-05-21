package ru.egorka;

public class Program {

	public static void main(String[] args) {
		MyThread m1 = new MyThread("High Priority");
		MyThread m2 = new MyThread("Low Priority");
		
		m1.getThread().setPriority(Thread.NORM_PRIORITY+4);
		m2.getThread().setPriority(Thread.NORM_PRIORITY-4);
		
		m1.getThread().start();
		m2.getThread().start();
		
		try {
			m1.getThread().join();
			m2.getThread().join();
		}
		catch(InterruptedException exc) {
			System.out.println("Прерывание основного потока");
		}
		System.out.println("\nСчетчик потока High Priority: " + m1.getCounter());
		System.out.println("Счетчик потока Low Priority: " + m2.getCounter());
	}

}
