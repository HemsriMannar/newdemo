package oops;

public class RegularCust extends Customer {
	String custid;
	String name;
	String custtype;
	double amt;
    RegularCust(String custid, String name, String custtype, double amt) {
		super(custid, name, custtype);
		this.custid = custid;
		this.name = name;
		this.custtype = custtype;
		this.amt = amt;
	}
	//@Override
	double finalamt(double interest, double year) {
		double simpleint = this.amt*interest*year;
		double amt = this.amt+simpleint;	
		if(this.custtype == "domestic") {
			return amt-500;
		}
		else if(this.custtype == "business")
			return amt;
		return amt;
	}
	

}
