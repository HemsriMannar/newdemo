package programbasic;

public class string {
public static void main(String[] args) {
	String s =new String("Hello everyone");
	System.out.println(s.length());
	System.out.println(s.substring(6));
	String s1 =new String("Hello");
	System.out.println(s1.compareTo(s));
	String s2="";
	System.out.println(s2.isEmpty());
	System.out.println(s2.toLowerCase());
	String s3="Heldo";
	String replace=s3.replace('d', 'l');
	System.out.println(replace);
	String x="Welcome to Java";
	String y="WeLcOmE tO JaVa";
	System.out.println(x.equals(y));
	System.out.println("\n");
	System.out.println("Creating StringBuffer");
	StringBuffer sb = new StringBuffer("Welcome to Everyone");
	sb.append("enjoy your journey");
	System.out.println(sb);
	sb.insert(0, 'w');
	System.out.println(s);
	StringBuffer sb1=new StringBuffer("Hello");
	sb1.replace(0, 2, "hEl");
	System.out.println(sb1);
	sb.delete(0, 1);
	System.out.println(sb1);
	System.out.println("\n");
	System.out.println("Creating StringBuilder");
	StringBuilder sb2=new StringBuilder("Happy");
	sb1.append("Learning");
	System.out.println(sb2);

	System.out.println(sb2.delete(0, 1));

	System.out.println(sb2.insert(1, "Welcome"));

	System.out.println(sb2.reverse());
			
	System.out.println("\n");
	System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
	
	String str = "Hello"; 
    StringBuffer sbr = new StringBuffer(str); 
    sbr.reverse(); 
    System.out.println("String to StringBuffer");
    System.out.println(sbr); 
      
    // conversion from String object to StringBuilder 
    StringBuilder sbl = new StringBuilder(str); 
    sbl.append("world"); 
    System.out.println("String to StringBuilder");
    System.out.println(sbl);              		
}

	
}

