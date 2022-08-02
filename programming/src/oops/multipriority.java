package oops;

public class multipriority {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("mythread");
		t.setPriority(10);
		System.out.println(t);
		System.out.println(t.getId());
		System.out.println(t.getState());
		System.out.println(t.isAlive());
		
	}
	

}
