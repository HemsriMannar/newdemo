package oops;
class rect{
	int a;
	int b;
	
	public rect(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void getArea() {
		int area = a*b;
		System.out.println(area);
	}
}
public class encapsulation1 {
	public static void main(String[] args) {
		rect r = new rect(10, 20);
	    r.getArea();
		
	}
}
