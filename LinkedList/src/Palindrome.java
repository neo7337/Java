import java.util.Scanner;

public class Palindrome {
	
	Node head;
	static int length;
	static int flag=0;
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
		System.out.println("Enter the Number of elements in the link list");
		int n=in.nextInt();

		Palindrome llist=new Palindrome();
		
		System.out.println("Enter the list");
		for(int i=0;i<n;i++){
			int l=in.nextInt();
			llist.push(l);
		}
		System.out.println("Given Linked List");
		llist.printList(llist.head);
		length=llist.checkLength();
		llist.checkPalindrome();
		
		if(flag==1){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
	
	public int checkLength(){
		
		int len=0;
		Node node=head;
		while(node.next!=null){
			len++;
			node=node.next;
		}
		return len;
		
	}

	private void checkPalindrome() {
		// TODO Auto-generated method stub
		
		Node n=head;
		Node temp;
		Node current=head;
		int count=0;
		
		while(current!=null){
			count++;
			if(count==length/2){
				temp=current.next;
				Node head2=reverse(temp);
				while(head2!=null){
					if(n.data==head2.data){
						flag=1;
						return;
					}else{
						flag=0;
						return;
					}
				}
			}else{
				current=current.next;
			}
		}
	}

	Node reverse(Node node) {
		// TODO Auto-generated method stub
		
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		return node;
		
	}

	private void printList(Node head2) {
		// TODO Auto-generated method stub
		
		while(head2!=null){
			System.out.print(head2.data+"->");
			head2=head2.next;
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
