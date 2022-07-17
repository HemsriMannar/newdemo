package oops;

public class BankAct {
	public static void main(String[] args) {
		RegularCust customer1 = new RegularCust("123r","hems","business",10000);
		RegularCust customer2 = new RegularCust("122r","hems1","domestic",10000);
		
		EnterpriseCust customer11 = new EnterpriseCust("145r","hedgms","bigscale",10000);
		EnterpriseCust customer21 = new EnterpriseCust("wer3r","heasms","smallscale",10000);
		
		customer1.showCustdetails();
		System.out.println("finalamt"+customer1.finalamt(5,8));
		customer2.showCustdetails();
		System.out.println("finalamt"+customer2.finalamt(5,8));
		customer11.showCustdetails();
		System.out.println("finalamt"+customer11.finalamt(5,8));
		customer21.showCustdetails();
		System.out.println("finalamt"+customer21.finalamt(5,8));
		
		
	}

}
