package insertingnode;

public class addatgiven {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		addatgiven llist=new addatgiven();
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(4);
		
		llist.head.next=second;
		second.next=third;
		
		System.out.println("BEFORE");
		llist.printList();
		
		System.out.println("AFTER");
		llist.add(second,3);
		llist.printList();
		
	}
	
	public void printList(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data+" ");
			n=n.next;
		
		}
		
	}
	
	public void add(Node prev_node, int new_data){
		if(prev_node==null){
			System.out.println("The given previous node cannot be null");
			return;
		}
		
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}

}
