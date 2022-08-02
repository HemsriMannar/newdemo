package DataStructure;

public class Doublyll {
	Node head;
	Node tail;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void insertbegin(int new_data) {
		Node newnode = new Node(new_data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			head.prev = newnode;
			newnode.next = head;
			head = newnode;
		}

	}

	public void InsertAtpos(int pos, int data) {
		if (pos == 0) {
			insertbegin(data);
			// System.out.println("The given previous node cannot be NULL ");
			return;
		}
		Node newnode = new Node(data);
		Node temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		newnode.prev = temp;
		if (temp == tail)
			tail = newnode;
		else
			temp.next.prev = newnode;
		temp.next = newnode;

	}

	void append(int new_data) {
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;
	}

	public void deletepos(int pos) {
		Node temp = head;
		Node prev = null;

		if (pos == 0) {
			head = head.next;
			if (head == null)
				tail = null;
			else
				head.prev = null;
			return;
		}
		for (int i = 1; i < pos; i++) {
			prev = temp;
			temp = temp.next;

		}
		prev.next = temp.next;
		if (temp.next == null)
			tail = prev;
		else
			temp.next.prev = prev;
	}

	public void printlist(Node node) {
		Node temp = head;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			temp = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
	}

	public static void main(String[] args) {
		Doublyll dll = new Doublyll();
		// dll.append(6);
		dll.insertbegin(7);
		dll.insertbegin(1);
		// dll.append(4);
		dll.InsertAtpos(1, 8);
		dll.InsertAtpos(3, 10);
		dll.printlist(dll.head);
		dll.deletepos(0);
		System.out.println("Created DLL is: ");
		dll.printlist(dll.head);
	}
}
