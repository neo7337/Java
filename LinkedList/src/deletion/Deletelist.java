package deletion;

import java.util.Scanner;

public class Deletelist {
	
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
		Deletelist list=new Deletelist();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		System.out.println("Delete the linked list");
		list.delete();
		System.out.println("Linked list deleted");
		list.printList();
	}

	private void delete() {
		// TODO Auto-generated method stub
		head=null;
		
	}

	private void push(int l) {
		// TODO Auto-generated method stub
		
		Node new_node=new Node(l);
		
		if(head==null){
			head=new_node;
			return;
		}
		
		new_node.next=null;
		
		Node tmp=head;
		while(tmp.next!=null){
			tmp=tmp.next;
		}
		tmp.next=new_node;
		return;
	}
	
	public void printList(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
		if(n==null){
			System.out.println("null");
		}
	}

}
