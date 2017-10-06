import java.util.Scanner;


public class swap {
	
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
		swap list=new swap();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		System.out.println("Enter the numbers you want to swap");
		int one=in.nextInt();
		int two=in.nextInt();
		list.swapNodes(one,two);
		System.out.println("Swapped nodes");
		list.printList();
		
	}
	
	public void swapNodes(int x, int y){
		
		//nothing to do if x and y are same
		if(x==y) return;
		
		//search for x and keep track of currx and prevx
		Node prevx=null;
		Node currx=head;
		while(currx!=null && currx.data!=x){
			prevx=currx;
			currx=currx.next;
		}
		
		//search y and keep track of prevy and curry
		Node prevy=null;
		Node curry=head;
		while(curry!=null && curry.data!=y){
			prevy=curry;
			curry=curry.next;
		}
		
		//if either x and y is not present nothing to do 
		if(currx==null || curry==null){
			return;
		}
		
		//if x is not the head of the linked list
		if(prevx!=null){
			prevx.next=curry;
		}else{
			head=curry;
		}
		
		//if y is not the head of the linked list
		if(prevy!=null){
			prevy.next=currx;
		}
		else{
			head=currx;
		}
		
		//swap
		Node temp=currx.next;
		currx.next=curry.next;
		curry.next=temp;
		
	}

	public void push(int new_data){
		Node new_node=new Node(new_data);
		
		if(head==null){
			head=new Node(new_data);
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
	
	public void printList(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
}
