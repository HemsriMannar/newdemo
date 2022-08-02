package oops;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=45,b=0,rs=0;
		try {
			if(b==0) {
				throw(new ArithmeticException("Can't divide by zero."));
			}
			else {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);

			}
		}catch(ArithmeticException Ex) {
            System.out.print("\n\tError : " + Ex.getMessage());
		}

	}

}
