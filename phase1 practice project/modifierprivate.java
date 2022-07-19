package programbasic;
class a{
	private void show() {
		System.out.println("private specifier");
	}
}
public class modifierprivate {
	public static void main(String[] args) {
		a obj = new a();
		System.out.println("private access specifier");
		
	}
}
