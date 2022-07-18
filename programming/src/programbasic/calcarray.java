package programbasic;

import java.util.Scanner;
class calculation{
	private int a;
	private int b;
//	public int getA() {
//		return a;
//	}
	public void setA(int a) {
		this.a = a;
	}
//	public int getB() {
//		return b;
//	}
	public void setB(int b) {
		this.b = b;
	}
	public void calc() {
		int operator;
		System.out.println("Enter any choice 1. +,2. -,3. *,4. %");	
		Scanner input = new Scanner(System.in);
		operator = input.nextInt();
		switch(operator) {
		case 1: System.out.println("the answer is:"+(a+b));break;
		case 2: System.out.println("the answer is:"+(a-b));break;
		case 3: System.out.println("the answer is"+ a*b);break;
		case 4: System.out.println("the answer is:"+a/b);break;
		}
		
	}
}
public class calcarray {
	//private static Scanner sc;
	public static void main(String[] args) {
		int a1;
		int b1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		a1=input.nextInt();
		System.out.println("Enter second number");
		b1=input.nextInt();	
		calculation c = new calculation();
		c.setA(a1);
		c.setB(b1);
		c.calc();
		
	}
	

}
