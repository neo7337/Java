import java.util.Scanner;

//nth node from the end of a list

public class nthnode {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		nthnode list=new nthnode();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		System.out.println("Enter the nth node");
		int n=in.nextInt();
		list.findnode(n);
	}

	private void findnode(int n) {
		// TODO Auto-generated method stub
		
		Node tmp=head;
		int len=0;
		while(tmp.next!=null){
			tmp=tmp.next;
			len++;
		}
		
		if(len<n){
			return;
		}
		
		tmp=head;
		for(int i=0;i<len-n+1;i++){
			tmp=tmp.next;
		}
		System.out.println("nth Node:"+tmp.data);
		
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
		
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		
		temp.next=new_node;
		
	}
	
	
}
