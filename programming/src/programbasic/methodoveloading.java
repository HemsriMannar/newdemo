package programbasic;

public class methodoveloading {
	public void area(int a,int b) {
		System.out.println("area of triangle:"+0.5*a*b);
	}
	public void area(int a) {
		System.out.println("area of triangle:"+3.14*a*a);
	}
	public static void main(String[] args) {
		methodoveloading obj = new methodoveloading();
		obj.area(10,20);
		obj.area(50);
	}
}




