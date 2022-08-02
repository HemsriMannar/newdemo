package DataStructure;

//import java.util.LinkedList;

public class linkedlistmain {
public static void main(String[] args) {
	LinkedListt list = new LinkedListt();
	list.insert(10);
	list.insert(20);
	list.insert(30);
	list.show();
	list.reverse();
	list.show();
	list.insertatbegin(40);
	list.insertatmiddle(4,50);
	list.show();
	list.deletepos(2);
	list.deletepos(0);
	list.show();
}
}
