package oops;
class chat {
	boolean flag= false;
	public synchronized void question(String msg) {
		if(flag==true) {
			 try {
				 wait();
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		}
		System.out.println(msg);
		flag=true;
		notify();
	}
	public synchronized void answer(String msg) {
		if(flag==false) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag=false;
		notify();

	}
	
}
class teacher implements Runnable{
	chat m;
	String s1[]={ "Hi", "How are you ?", "I am also doing fine!" };
	public teacher(chat m) {
		this.m = m;
		Thread t=new Thread(this,"teacher");
		t.start();
		
	}
	@Override
	public void run() {
		
		 for (int i = 0; i < s1.length; i++) {
	            m.question(s1[i]);
	        }
		
	}
	
}
class student implements Runnable{
	chat m;
	 String[] s2 = { "Hi", "I am good, what about you?", "Great!" };
	public student(chat m) {
		//super();
		this.m = m;
		Thread t=new Thread(this,"student");
		t.start();
	}
	@Override
	public void run() {
		 for (int i = 0; i < s2.length; i++) {
	            m.answer(s2[i]);
	        }
		
	}
	
}
public class Interthreadcommunication {
	 public static void main(String[] args) {
	        chat m = new chat();
	        new teacher(m);
	        new student(m);
	    }
}
