package oops;
class message {
	synchronized void run(String msg) throws InterruptedException{
		System.out.println("Sending"+msg);
		Thread.sleep(1000);
		System.out.println("\n" + msg + "Sent"); 
	}
}
class message1 extends Thread{
	message m;
	String msg;
	public message1(String msg, message m) {
		super();
		this.m = m;
		this.msg=msg;
	}
	public void run() {    
			try {
				m.run(msg);
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}	
}
public class Syncro {
	public static void main(String[] args) {
		message obj1 =new message();
		message1 t =new message1("Hi",obj1);
		message1 t1=new message1("bye",obj1);
		t.start();
		t1.start();	
	}
}
