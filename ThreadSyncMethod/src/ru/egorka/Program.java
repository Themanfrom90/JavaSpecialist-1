package ru.egorka;

class SumArray {
	private int sum;
	
	synchronized int sumArray(int nums[]) {
		sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + ": " + sum);
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException exc) {
				System.out.println("Прерывание основного потока");
			}
		}
		return sum;
	}
}

class MyThread implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	MyThread(String name, int nums[]) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start();
	}
	
	public void run() {
		int sum;
		System.out.println(thrd.getName() + " - запуск!");
		
		answer = sa.sumArray(a);
		System.out.println("Сумма для " + thrd.getName() + ": " + answer);
		
		System.out.println(thrd.getName() + " - завершение!");
	}
}

public class Program {
	public static void main (String args[]) {
		int a[] = {1,2,3,4,5};
		
		MyThread m1 = new MyThread("Thread #1", a);
		MyThread m2 = new MyThread("Thread #2", a);
	}
}
