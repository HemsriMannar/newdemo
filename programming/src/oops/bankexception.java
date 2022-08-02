package oops;

import java.util.Scanner;

class amount extends Exception {

	public amount(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}

public class bankexception {
	static void validate(int amount) throws amount {
		if (amount > 10000) {
			throw new amount(" not have enough amount");
		} else
			System.out.println("transaction successfull");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		try {
			validate(t);
		} catch (amount e) {
			e.printStackTrace();

		}
	}

}
