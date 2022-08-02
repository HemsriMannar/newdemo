package DataStructure;
public class SinglyLinkedList {    
    //Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //Represent the head and tail of the singly linked list    
    public Node head;
	public void addNode(int data) {
		Node node = new Node(data); //here node is created
		node.data = data; //node get value  18,null
		node.next = null;
		if(head==null) {
			head=node;
		}
		else {
			Node n= head; // n is a temporay variable which 1st points to head
			while(n.next!=null) {
				n=n.next; //if head is not null thn we have to jump to next node,
						  //here now n value points to next node
			}//once the node reaches null it comes out of the loop
			n.next=node; // and the newly added data is inserted at last so need to point that node
		}                //newly added node(node) address is stored to current node(n.next).
	}  
        
    //display() will display all the nodes present in the list    
	public void show() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
        
    public static void main(String[] args) {    
            
        SinglyLinkedList sList = new SinglyLinkedList();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
        //Displays the nodes present in the list    
        sList.show();    
    }    
}    

