package oops;

public class EnterpriseCust extends Customer {

	String custid;
	String name;
	String custtype;
	double amt;
	EnterpriseCust(String custid, String name, String custtype, double amt) {
		super(custid, name, custtype);
		this.custid = custid;
		this.name = name;
		this.custtype = custtype;
		this.amt = amt;
	}
	//@Override
	double finalamt(double interest, double year) {
		double simpleint = amt*interest*year;
		double amt = this.amt+simpleint;
		amt=amt-500;
		if(this.custtype == "smallscale") {
			return amt-100;
		}
		else if(this.custtype == "bigscale")
			return amt;
		return amt;
	}
	
}
