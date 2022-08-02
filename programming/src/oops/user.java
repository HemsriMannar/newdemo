package oops;

public class user extends Thread {
//String name;
//Sender sender;
//
//public user(String name, Sender sender) {
//	this.name = name;
//	this.sender = sender;
//}
//
//
//
//public void run() {
//	System.out.println(name+" wants to send message "+name);
//	synchronized (sender){
//		
//		sender.send(name);
//	}
//}
	String name;

	Sender sender;
	
	public user(String name,Sender sender) {
		this.name=name;
		//this.msg=msg;
		this.sender=sender;
		
	}
	
	public void run() {
		System.out.println(" wants to send message "+name);
		
		//sender.send(msg);
		
		synchronized(sender) {
			sender.send(name);
		}
		
	}


}


