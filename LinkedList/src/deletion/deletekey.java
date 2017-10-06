package deletion;

import java.util.Scanner;

public class deletekey {
	
	Node head;
	int count=0;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		deletekey llist=new deletekey();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int numb=in.nextInt();
		
		System.out.println("enter the elements");
		for(int i=0;i<numb;i++){
			int d=in.nextInt();
			llist.push(d);
		}
		llist.printList();
		
		System.out.println("enter the element to delete");
		int el=in.nextInt();
		
		llist.delAll(el);
		llist.printList();
	}
	
	public void delAll(int element){
		Node n=head;
		
		while(n!=null){
			if(n.data==element){
				count++;
				del(element);
			}
			n=n.next;
		}
		System.out.println(count);
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
	
	public void printList(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.print("null");
		System.out.println("");
	}
	
	public void push(int key){
		Node new_node=new Node(key);
		
		if(head==null){
			head=new Node(key);
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