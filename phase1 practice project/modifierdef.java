package programbasic;
class access{
	void show() {
		System.out.println("default specifier");
	}
}
class modifierdef {
	public static void main(String[] args) {
		access a =new access();
		a.show();
	}
}
