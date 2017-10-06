import java.util.Scanner;

//reversing the group of linked list to form a new linked list
public class ReverseGroup {
	
	node head;
	
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		ReverseGroup list=new ReverseGroup();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		System.out.println("Enter the amount of nodes to be reversed");
		int k=in.nextInt();
		
		list.head=list.reverse(list.head,k);
		
		list.printList();
		
	}
	
	private node reverse(node head2, int k) {
		// TODO Auto-generated method stub
		
		node current=head2;
		node prev=null;
		node next=null;
		
		int count=0;
		while(count<k && current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next!=null){
			head2.next=reverse(next,k);
		}
		
		return prev;
	}

	private void printList() {
		// TODO Auto-generated method stub
		node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("");
		return;
	}

	private void push(int l) {
		// TODO Auto-generated method stub
		node new_node=new node(l);
		if (head==null){
			head=new_node;
			return;
		}
		
		new_node.next=null;
		
		node n=head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=new_node;
		return;
	}

}
