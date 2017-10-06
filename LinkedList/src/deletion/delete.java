package deletion;


public class delete {
	
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
		
		delete llist=new delete();
		llist.push(1);
		llist.push(4);
		llist.push(8);
		llist.push(54);
		
		System.out.println("BEFORE");
		llist.printList();
		
		System.out.println("AFTER");
		llist.del(4);
		llist.printList();
		
		
	}
	
	public void printList(){
		Node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
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
	
	public void del(int key){
		
		Node temp=head;
		Node prev=null;
		if(temp!=null && temp.data==key){
			head=temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key){
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null){
			return;
		}
		
		prev.next=temp.next;
	}

}
