package insertingnode;

public class front {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
		

	}
	
	public static void main(String[] args) {
		front llist=new front();
		front.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		front.head.next=second;
		second.next=third;
		
		System.out.println("BEFORE");
		llist.printList();
		
		System.out.println("AFTER");
		llist.push(0);
		
		llist.printList();
	}

	private void push(int i) {
		// TODO Auto-generated method stub
		
		Node new_node=new Node(i);
		new_node.next=head;
		head=new_node;
	}
	
	public void printList(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data+" ");
			n=n.next;
		
	}
	
	}
}
