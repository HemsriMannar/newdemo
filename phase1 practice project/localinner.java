package programbasic;

public class localinner {
	void display() {
		class inner{
			void msg() {
				System.out.println("Locsl inner class");
			}
		}
	inner in= new inner();
	in.msg();
}
	public static void main(String[] args) {
		localinner obj = new localinner();
		obj.display();
		
	}
}
