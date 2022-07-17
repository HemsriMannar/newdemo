package hello;

import java.util.Scanner;

public class quizprog {
		  public static void main(String[] args) {
			  while(true)
			  {
				  System.out.println("which is national bird");
				  System.out.println("\n1.peacock \n2.crow \n3.pegion \4.exit question");
				  System.out.println("enter any option no");
				  Scanner sc =new Scanner(System.in);
				  int n= sc.nextInt();
				  if(n==1)
				  {
					  System.out.println("crt option");
					  break;
				  }
				  else if(n==4)
					  break;
				  else
					  System.out.println("wrong option chose once gain"); 
			  }
			  
		  }
		

}
