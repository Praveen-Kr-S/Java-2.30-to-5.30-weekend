package Learn_threads;


class Run extends Thread{
	public void run() {
		System.out.println("Run Mode is ON.."+Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
	}
}

class Move extends Thread{
	public void run() {
		System.out.println("Move Mode is ON.."+Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
	}
}

class Map extends Thread{
	public void run() {
		System.out.println("Map Mode is ON.."+Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority());
	}
}

public class Learn_PriorityThread {

	public static void main(String[] args) {
		
		Run t1 = new Run();
		Move t2 = new Move();
		Map t3 = new Map();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		//Priority Value is 1-10
		
		t1.setPriority(2
				);
		t2.setPriority(5);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
