package oops;
interface first{
	default void show() {
		System.out.println("First");
	}
}
interface second{
	default void show() {
		System.out.println("Second");
	}
}

public class DiamondProject implements first,second {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		first.super.show();
		second.super.show();
	}
	public static void main(String[] args) {
		 DiamondProject d = new  DiamondProject();
		 d.show();
	}	
	

}
