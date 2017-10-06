import java.util.Scanner;

//pairwise swap elements of a given linked list

public class PairSwap {
	
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
		PairSwap list=new PairSwap();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		list.pairSwap();
		list.printList();
		
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
	
	private void pairSwap() {
		// TODO Auto-generated method stub
		
		node n=head;
		
		while(n!=null && n.next!=null){
			int k=n.data;
			n.data=n.next.data;
			n.next.data=k;
			n=n.next.next;
		}
		
	}

}
