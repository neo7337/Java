import java.util.Scanner;

import deletion.Deletelist;

//removing Duplicates from the linked list
public class Duplicates {
	
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
		
		Scanner in=new Scanner(System.in);
		Duplicates list=new Duplicates();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		System.out.println("Remove duplicates");
		list.remDuplicates();
		list.printList();
		
	}

	private void remDuplicates() {
		// TODO Auto-generated method stub
		Node current=head;
		Node next_next;
		if(head==null){
			return;
		}
		
		while(current.next!=null){
			if(current.data==current.next.data){
				next_next=current.next.next;
				current.next=null;
				current.next=next_next;
			}
			else
				current=current.next;
		}
		
	}

	private void printList() {
		// TODO Auto-generated method stub
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
		
	}

	private void push(int l) {
		// TODO Auto-generated method stub
		Node new_node=new Node(l);
		if(head==null){
			head=new_node;
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
	
	

}
