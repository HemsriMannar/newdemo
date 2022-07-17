package hello;
class student{
	int regno;
	String name;
	
	public student(int regno, String name) {
		//super();
		this.regno = regno;
		this.name = name;
	}
}

public class studentsprog {
	public static void main(String[] args) {
		student[] arr;
		arr =new student[5];
		arr[0]= new student(1234 , "hems");
		arr[1]= new student(1234 , "hems1");
		arr[2]= new student(1234 , "hems2");
		arr[3]= new student(1234 , "hems3");
		arr[4]= new student(1234 , "hems4");
		//for(student a:arr)
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("regno " +arr[i].regno + " name " +arr[i].name);
		}
	}
	 
}
