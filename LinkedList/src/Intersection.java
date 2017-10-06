import java.util.HashSet;
import java.util.Scanner;

public class Intersection {
	
	node head;
	static Intersection i;
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
		Intersection sec=new Intersection();
		Intersection list=new Intersection();
		System.out.println("Enter the numer of nodes for first list");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		Intersection list2=new Intersection();
		System.out.println("Enter the numer of nodes for second list");
		int numb2=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb2;i++){
			int l=in.nextInt();
			list2.push(l);
		}
		list2.printList();
		
		sec.intersection(list.head,list2.head);
		System.out.println("Intersection list");
		i.printList();
		
		
	}

	private void intersection(node head2, node head3) {
		// TODO Auto-generated method stub
		
		node n1=head2;
		node n2=head3;
		i=new Intersection(); 
		HashSet<Integer> hs1=new HashSet<Integer>();
		HashSet<Integer> hs2=new HashSet<Integer>();
		
		int len1=checkLen(n1);
		int len2=checkLen(n2);
		
		while(n1!=null){
			hs1.add(n1.data);
			n1=n1.next;
		}
		while(n2!=null){
			hs2.add(n2.data);
			n2=n2.next;
		}

		for(Integer x : hs1){
			if(!hs2.add(x)){
				i.push(x);
			}
		}
	}

	private int checkLen(node n1) {
		// TODO Auto-generated method stub
		int count=1;
		while(n1.next!=null){
			count++;
			n1=n1.next;
		}
		return count;
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
