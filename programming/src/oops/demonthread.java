package oops;


	public class  demonthread extends Thread{

		   public void run(){  
				
			  // Checking whether the thread is Daemon or not
			  if(Thread.currentThread().isDaemon()){ 
			      System.out.println("Daemon thread executing");  
			  }  
			  else{  
			      System.out.println("user(normal) thread executing");  
		          }  
		   }  
		   public static void main(String[] args){  
			 /* Creating two threads: by default they are 
			  * user threads (non-daemon threads)
			  */
			   demonthread t1=new  demonthread();
			   demonthread t2=new  demonthread();   
					 
			 //Making user thread t1 to Daemon
		        t1.setDaemon(true);
				     
		        //starting both the threads 
		        t1.start(); 
		        t2.start();  
		   } 
	}



