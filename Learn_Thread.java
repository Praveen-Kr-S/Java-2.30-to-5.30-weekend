package Learn_threads;

class Demo extends Thread{
	public void run(){
		System.out.println("Hello Nisha");
		System.out.println(Thread.currentThread().getName());
	}
}

class sdRunnable implements Runnable{
	@Override
	public void run() {

		System.out.println("Hello Poorna");
		System.out.println(Thread.currentThread().getName());
		
	}
}

public class Learn_Thread {
	public static void main(String[] args) {
		
//		Demo t = new Demo();
//		t.start();
//		
//		Demo t1 = new Demo();
//		t1.start();
		
		
		
		sdRunnable m = new sdRunnable();
		Thread th = new Thread(m);
		th.start();
		 
	}
}
