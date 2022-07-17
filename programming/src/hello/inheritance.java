package hello;
class A{
	public void methodA() {
		System.out.println("parent cls");
	}
}
class B extends A{
	public void methodB() {
		System.out.println("child class");
	}
}
public class inheritance {
public static void main(String[] args) {
	B b = new B();
	b.methodA();
}
}
