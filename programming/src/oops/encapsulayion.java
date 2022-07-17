package oops;
class A{
	private int b;
	private int c;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
}
public class encapsulayion {
	public static void main(String[] args) {
		A a = new A();
		a.setB(10);
		a.setC(11);
		System.out.println(a.getB()+" "+a.getC());
	}

}
