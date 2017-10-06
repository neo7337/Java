import java.util.HashSet;
import java.util.Scanner;

import deletion.Deletelist;

//remove duplicates from the unsorted list 
public class Duplicates2 {
	
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
		Duplicates2 list=new Duplicates2();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		list.removeDuplicates();
		list.printList();
		
	}

	private void removeDuplicates() {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		Node current=head;
		Node prev=null;
		while(current!=null){
			int curval=current.data;
			if(hs.contains(curval)){
				prev.next=current.next;
			}else{
				hs.add(curval);
				prev=current;
			}
			current=current.next;
		}
	}

	private void printList() {
		// TODO Auto-generated method stub
		
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
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
		
		Node n=head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=new_node;
		return;
	}

}
