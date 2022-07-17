package oops;

public abstract class Customer {
	String custid;
	String name;
	String custtype;
	
	Customer(String custid, String name, String custtype) {
		//super();
		this.custid = custid;
		this.name = name;
		this.custtype = custtype;
		
	}
	void showCustdetails() {
		System.out.println("custid :"+this.custid);
		System.out.println("name :"+this.name);
		System.out.println("custtype :"+this.custtype);
	}
	abstract double finalamt(double interest, double year);

}
