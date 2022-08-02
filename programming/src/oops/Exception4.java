package oops;
class MyException extends Exception{

	public MyException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
}
public class Exception4 {
	public static void main(String[] args) {
		try {
		throw new MyException("temp");
		}catch(MyException ex){
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
	}
}
