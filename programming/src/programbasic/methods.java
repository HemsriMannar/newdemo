package programbasic;
public class methods {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {
		methods a =new methods();
		int res= a.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+res);

	}
}

