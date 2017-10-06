import java.util.Scanner;

public class AlternateSplit {
	
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
		AlternateSplit list=new AlternateSplit();
		System.out.println("Enter the numer of nodes");
		int numb=in.nextInt();
		System.out.println("Enter the nodes");
		for(int i=0;i<numb;i++){
			int l=in.nextInt();
			list.push(l);
		}
		list.printList();
		
		System.out.println("Aletrnate Splitting");
		list.split();
	}

	private void split() {
		// TODO Auto-generated method stub
		
		AlternateSplit list1=new AlternateSplit();
		AlternateSplit list2=new AlternateSplit();
		
		node temp=head;
		int count=0;
		
		while(temp!=null){
			
			if(count%2==0){
				list1.push(temp.data);
			}
			else
				list2.push(temp.data);
			count++;
			temp=temp.next;
		}
		list1.printList();
		list2.printList();
		
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
