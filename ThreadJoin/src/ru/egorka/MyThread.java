package ru.egorka;

public class MyThread implements Runnable{
	private Thread thrd;
	public int start=0, end=800;
	
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
		System.out.println("Поток " + getThread().getName() + " запущен!");
		for(int i=start; i<end; i++) {
			if (i==end-1)
				System.out.printf("%s : %d\t->>> End of Thread\n", getThread().getName(), i);
			else
				System.out.printf("%s : %d\n", getThread().getName(), i);
			try {
				Thread.sleep(1);
			}
			catch(InterruptedException exc) {
				System.out.printf("%s : %d\t->>> Interrutped!\n",getThread().getName(),i);
			}
		}
		
	}

}