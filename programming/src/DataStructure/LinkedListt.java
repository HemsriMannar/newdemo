package DataStructure;

public class LinkedListt {
	public Node head;

	public void insert(int data) {
		Node node = new Node(data); // here node is created
//		node.data = data; //node get value  18,null
//		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head; // n is a temporay variable which 1st points to head
			while (n.next != null) {
				n = n.next; // if head is not null thn we have to jump to next node,
							// here now n value points to next node
			} // once the node reaches null it comes out of the loop
			n.next = node; // and the newly added data is inserted at last so need to point that node
		} // newly added node(node) address is stored to current node(n.next).

	}

	public void insertatbegin(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}

	}

	public void insertatmiddle(int pos, int val) {
		if (pos == 0) {
			insertatbegin(val);
			return;
		}
		Node newnode = new Node(val);
		Node temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next; 

		}
		newnode.next = temp.next;
		temp.next = newnode;

	}
	public void deletepos(int pos) {
		if(pos==0) {
			head= head.next;
			return;
		}
		Node temp= head;
		Node prev=null;
		for(int i=1;i<=pos;i++) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		
	}
	public void reverse() {
		Node prev=null;
		Node current=head;
		Node next=head.next;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}
