import java.util.Scanner;


public class Count {
	
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
		Count list=new Count();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		System.out.println("Enter the element you want to count");
		int n=in.nextInt();
		
		list.count(n);
	}

	private void count(int n) {
		// TODO Auto-generated method stub
		
		Node tmp=head;
		int count=0;
		while(tmp!=null){
			if(n==tmp.data){
				count++;
			}
			tmp=tmp.next;
		}
		System.out.println("Count"+count);
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
	
	public void printList(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.println("");
	}

}
