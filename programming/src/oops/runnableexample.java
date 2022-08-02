package oops;

	
public class runnableexample implements Runnable {
	static int count=0;
	public void run() {
		while(count<=5)
		{
			try {
				count++;
				System.out.println("Expl Thread:"+count);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Runnable method");
		
	}
	
public static void main(String[] args) {
	Thread t = new Thread(new runnableexample());
	System.out.println("Starting Main Thread...");
	t.start();
	while(count<=5)
	{
		try {
			count++;
			System.out.println("Main Thread:"+count);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("End of Main Thread...");
	
	
	
}
}

