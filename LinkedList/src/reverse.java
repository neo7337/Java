import java.util.Scanner;


public class reverse {
	
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
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number of elements in the link list");
		int n=in.nextInt();

		reverse llist=new reverse();
		
		System.out.println("Enter the list");
		for(int i=0;i<n;i++){
			int l=in.nextInt();
			llist.push(l);
		}
		System.out.println("Given Linked List");
		llist.printList(llist.head);

		head=llist.rev(llist.head);
		System.out.println("");
		System.out.println("REVERSED");
		llist.printList(head);
		
		
	}
	
	Node rev(Node node){
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		return node;
	}
	
	public void push(int new_data){
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
	
	public void printList(Node n){
		
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}

}
