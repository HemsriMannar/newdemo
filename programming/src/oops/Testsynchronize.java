package oops;

public class Testsynchronize {
public static void main(String[] args) {
		Sender sender = new Sender();
		user t1 = new user("Java",sender);
		user t2 =new user("hello",sender);
		t1.start();
		t2.start();
		
		
	}
}

