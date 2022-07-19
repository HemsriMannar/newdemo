package programbasic;

public class Innerclass {
	class A{
		void display() {
			System.out.println("Inner Class");
		}
}
  public static void main(String[] args) {
	Innerclass obj = new Innerclass();
	Innerclass.A in = obj.new A();
	in.display();
}
}





