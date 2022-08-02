package programbasic;
class emp{
	int id;
	String name;
	emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+","+name);
	}
}
public class Paraconstructor {
	public static void main(String[] args){
		emp a = new emp(10,"hems");
		a.display();
		emp b = new emp(11,"yazhini");
		b.display();
		
	}
}