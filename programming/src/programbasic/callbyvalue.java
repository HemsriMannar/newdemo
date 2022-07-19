package programbasic;

public class callbyvalue {
	private int val=50;
	int operation(int val) {
		val=val*2;
		return val;
	}
	public static void main(String[] args) {
		callbyvalue a=new callbyvalue();
		System.out.println("Before operation"+a.val);
		//a.operation(20);
		System.out.println("After operation value of data is "+a.operation(20));
		
	}
}


