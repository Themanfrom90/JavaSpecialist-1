package ru.egorka;

public class MyThread implements Runnable{
	private Thread thrd;
	private int counter=0;
	
	static boolean stop = false;
	static String currentName;
	
	
	public Thread getThread() {
		return this.thrd;
	}
	
//	public void setThread() {
//		this.thrd = new Thread(this);
//	}
	
	public void setThread(String name) {
		this.thrd = new Thread(this,name);
		currentName = name;	
	}
	
	public int getCounter() {
		return this.counter;
	}
	
	public void setCounter(int count) {
		this.counter = count;
	}
	
	public void increaseCounter() {
		this.counter++;
	}
	
/*	MyThread() {
		setThread();
	}*/
	
	MyThread(String name) {
		setThread(name);
	}
	
	
	@Override
	public void run() {
		System.out.println(getThread().getName() + " - запуск!");
		do {
			increaseCounter();
			
			if(currentName.compareTo(getThread().getName()) != 0) {
				currentName = getThread().getName();
				System.out.println("В "+currentName);
			}
		} while (stop == false && getCounter() < 10000000);
		stop = true;
		
		System.out.println("\n" + getThread().getName() + " - завершение!");
		
	}

}
