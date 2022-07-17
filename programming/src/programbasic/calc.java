package programbasic;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Arithmetic Calculator");
		System.out.println("enter 1st number");
		Scanner no = new Scanner(System.in);
		a=no.nextInt();
		System.out.println("enter 2nd number");
		b=no.nextInt();
		System.out.println("Enter any choice 1. +,2. -,3. *,4. %");	
		int operator = no.nextInt();
		switch(operator) {
		case 1: System.out.println("the answer is:"+a+b);break;
		case 2: System.out.println("the answer is:"+(a-b));break;
		case 3: System.out.println("the answer is"+ a*b);break;
		case 4: System.out.println("the answer is:"+a/b);break;
		}
	}

	

}
