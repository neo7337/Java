package deletion;

import java.util.Scanner;

//delete nodes which have greater nodes on right side

public class Delete4 {
	
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
		Delete4 list=new Delete4();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		list.delete();
		list.printList();
	}
	
	
	
	private void delete() {
		// TODO Auto-generated method stub
		
		node prev=null;
		node current=head;
		
		while(current!=null){
			if(current.next.data>current.data){
				prev.next=current.next;
				current=current.next;
			}else{
				prev=current;
				current=current.next;
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
