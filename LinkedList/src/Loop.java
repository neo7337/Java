import java.util.Scanner;

public class Loop {
	
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
		Loop list=new Loop();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.head.next.next.next.next=list.head;
		System.out.println("Checking the loop in the list");
		list.loop();
		
	}

	int loop() {
		// TODO Auto-generated method stub
		
		Node a=head;
		Node b=head;
		while(a!=null && b!=null && b.next!=null){
			a=a.next;
			b=b.next.next;
			
			if(a==b){
				System.out.println("LOOP FOUND");
				return 1;
			}
		}
		return 0;
		
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
