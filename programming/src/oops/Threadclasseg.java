package oops;
//class mythread extends Thread{
//	public void run() {
//		System.out.println("run method");
//	}
//}
public class Threadclasseg extends Thread {
	public void run() {
		System.out.println("run method");
	}
public static void main(String[] args) {
	Threadclasseg t = new Threadclasseg();
	//t.setPriority(5);
	t.run();
	t.start();
	System.out.println("main method");
}
}


