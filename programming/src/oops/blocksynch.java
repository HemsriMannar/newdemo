package oops;
 class table{
	 synchronized void printtable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
		try {
		Thread.sleep(1000);
	    }catch (Exception e){
	    	System.out.println(e);
	    }
			//Thread.sleep(1000);
		}
		
}
}
class table2 extends Thread{
  table t;

public table2(table t) {
	super();
	this.t = t;
}
 public void run() {
	 t.printtable(5);
 }
  
}
class table3 extends Thread{
	table t;

	public table3(table t) {
		super();
		this.t = t;
	}
	public void run() {
		t.printtable(100);
	}
}
	
public class blocksynch {
	public static void main(String[] args) {
		table obj =new table();
		table2 t1 = new table2(obj);
		table3  t2 =new table3(obj);
		t1.start();
		t2.start();
		
	}
		
}
