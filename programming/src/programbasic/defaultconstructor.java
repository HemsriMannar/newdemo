package programbasic;
class empinfo{
	int i;
	String name;
	void display(int i,String name) {
		System.out.println(i+","+name);
	}
}
public class defaultconstructor {
	public static void main(String[] args) {
		empinfo a = new empinfo();
		a.display(10,"hems");
		empinfo b = new empinfo();
		b.display(11,"yazhini");
	}

}
