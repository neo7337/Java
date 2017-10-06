package insertingnode;

public class end {
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
		
		end llist=new end();
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		llist.head.next=second;
		second.next=third;
		
		System.out.println("BEFORE");
		llist.printList();
		
		System.out.println("AFTER");
		llist.add(4);
		llist.printList();
		
	}
	
	public void add(int new_data){
		
		Node new_node=new Node(new_data);
		
		if(head==null){
			head=new Node(new_data);
			return;
		}
		
		new_node.next=null;
		
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		
		last.next=new_node;
		return;
	}
	
	public void printList(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	
	

}
