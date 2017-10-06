import java.util.Scanner;

//deleting alternate nodes in the linked list
public class Alternate {
	
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
		Alternate list=new Alternate();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		list.altDelete();
		list.printList();
	}
	
	private void altDelete() {
		// TODO Auto-generated method stub
		
		if(head==null){
			return;
		}
		
		node prev=head;
		node now=prev.next;
		while(prev!=null && now!=null){
			prev.next=now.next;
			now=null;
			prev=prev.next;
			if(prev!=null){
				now=prev.next;
			}
		}
		
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
