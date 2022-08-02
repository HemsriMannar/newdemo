package oops;

public class Exception2 {
	void divide()throws ArithmeticException{
		int a=10,b=0;
		int res=a/b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Exception2 obj = new Exception2();
		try {
			obj.divide();
		}catch( ArithmeticException Ex) {
            System.out.print("\n\tError : "+ Ex.getMessage() );
		}
	}

}
