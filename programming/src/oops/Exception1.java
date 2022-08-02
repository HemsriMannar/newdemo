package oops;

public class Exception1 {
	public static void main(String[] args) {
		int a=4,b=0;
		int res=0;
		try {
			res=a/b;
		}catch(ArithmeticException Ex) {
			System.out.print("\n\tError : " + Ex.getMessage());
		}
		finally
        {
            System.out.print("\n\tThe result is : " + res);
        }

	}

}
