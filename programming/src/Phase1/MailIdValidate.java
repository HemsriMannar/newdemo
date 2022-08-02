package Phase1;
import java.util.ArrayList;
import java.util.Scanner;
public class MailIdValidate {
	public static void valid(ArrayList<String>list) {
		System.out.println("Enter the mail ID: ");
		Scanner input = new Scanner(System.in);
	      String sc=input.next();
	      int count=0;
		 //String[] list = null;
		for(String element:list) {
	    	  if(element.equals(sc)) {
	    		  count=1;
	    		  break;
	    	  }
	      }
		if(count==1)
		{
			System.out.println("Mail ID is valid");
		}
		else
		{
			System.out.println("Sorry,The given mailId is not valid");
		}
	}
	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		  list.add("emp23@gmail.com");
	      list.add("emp24@gmail.com");
	      list.add("emp25@gmail.com");
	      list.add("emp26@gmail.com");
	      list.add("emp27@gmail.com");
	      
	      //MailIdValidate a =new MailIdValidate();
	      MailIdValidate.valid(list);
	    
	     
	}
}
