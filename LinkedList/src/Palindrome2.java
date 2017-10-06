import java.util.Scanner;

//check if a linked list of strings from a palindrome
public class Palindrome2 {
	
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
		Palindrome2 list=new Palindrome2();
		System.out.println("Enter the numer of nodes for first list");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		list.checkPalindrome();
	}

	
	
	
	private void checkPalindrome() {
		// TODO Auto-generated method stub
		
		
		
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
