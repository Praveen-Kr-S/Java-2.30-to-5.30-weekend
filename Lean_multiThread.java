package Learn_threads;

class Fire extends Thread{
	public void run() {
		System.out.println("Fire Mode is ON.."+Thread.currentThread().getId());
	}
}

class Jump extends Thread{
	public void run() {
		System.out.println("Jump Mode is ON.."+Thread.currentThread().getId());
	}
}

class Scope extends Thread{
	public void run() {
		System.out.println("Scope Mode is ON.."+Thread.currentThread().getId());
	}
}

public class Lean_multiThread {
	public static void main(String[] args) throws InterruptedException {
		Fire t1 = new Fire();
		Jump t2 = new Jump();
		Scope t3 = new Scope();
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		
		
	}
}
