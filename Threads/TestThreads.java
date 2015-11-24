public class TestThreads{
	
	
	public static void main(String[] args) throws InterruptedException{
	SynchronizedCounter	sc=new SynchronizedCounter();
System.out.println("initial: \t"+sc.value());
		for(int i=0;i<10;i++){
			Thread inc= new Thread(new ThreadIncrementer(sc));
			inc.start();
			System.out.println("incremented: \t"+sc.value());
			inc.join();
			Thread dec=new Thread(new ThreadDecrementer(sc));
			dec.start();
			System.out.println("Decremented: \t"+sc.value());
			dec.join();
			
		}

		System.out.println("Final: \t"+sc.value());

	}

}

class ThreadIncrementer implements Runnable{
SynchronizedCounter	sc;

	public ThreadIncrementer(SynchronizedCounter	sc){
		this.sc=sc;
	}

	public void run(){
		sc.increment();

	}

}

 class ThreadDecrementer implements Runnable{
SynchronizedCounter	sc;

	public ThreadDecrementer(SynchronizedCounter	sc){
		this.sc=sc;
	}

	public void run(){
		sc.decrement();

	}

}