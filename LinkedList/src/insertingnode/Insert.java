package insertingnode;

import java.util.Scanner;
//this program is to insert in a sorted way

public class Insert {
	
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
		Insert list=new Insert();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		System.out.println("Enter the number to be inserted");
		int n=in.nextInt();
		list.insert(n);
		list.printList();
	}

	private void insert(int n) {
		// TODO Auto-generated method stub
		Node new_node=new Node(n);
		if(head==null && head.data>new_node.data){
			head=new_node;
			System.out.println("exec");
			return;
		}
		
		Node prev=head;
		Node temp=prev.next;
		while(prev!=null && temp!=null){
			if(n<prev.data){
				new_node.next=head;
				head=new_node;
				return;
			}else if(temp.data>n){
				prev.next=new_node;
				new_node.next=temp;
				return;
			}
			
			prev=prev.next;
			temp=temp.next;
		}
	}

	private void printList() {
		// TODO Auto-generated method stub
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.println("");
		
	}

	private void push(int l) {
		// TODO Auto-generated method stub
		
		Node new_node=new Node(l);
		if(head==null){
			head=new_node;
			return;
		}
		
		new_node.next=null;
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=new_node;
		return;
	}

}
