package oops;
public class trycatch {
	public static void main(String[] args) {
		int arr[]= new int[3];
		try {
		arr[7]=10;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index is out of bounds!");
		}
		finally {
			System.out.println("The array is of size " + arr.length);
		}		
	}

}
