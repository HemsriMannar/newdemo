package oops;

public class Sender {

	public void send(String name) {
		System.out.println("Sending msg.."+name);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
			System.out.println("Error while sending"+ex);
		}
		System.out.println("msg sent..."+name);
		
	}
	
}
