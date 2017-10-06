package deletion;

import java.util.Scanner;

//last occurence of an item in linked list deletion
public class Delete3 {
	
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
		Delete3 list=new Delete3();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		System.out.println("Enter the key to delete ");
		int key=in.nextInt();
		
		Delete3 delkey=new Delete3();
		
		
		
		
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
