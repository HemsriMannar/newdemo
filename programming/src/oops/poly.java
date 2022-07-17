package oops;

public class poly {
	public static void main(String[] args) {
		housearchi ha;
		ha = new Villa();
		System.out.println(String.format("%.0f",ha.cost()));
		System.out.println(ha.bankavailable());
		
		ha= new apartmeant();
		System.out.println(String.format("%.0f",ha.cost()));
		System.out.println(ha.bankavailable());
	}
	

}
