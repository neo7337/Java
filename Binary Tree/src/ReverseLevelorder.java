import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverseLevelorder {

	static class Node{
		int data;
		Node left,right;
		Node(int item){
			data=item;
			left=null;
			right=null;
		}
	}
	
	Node root;
	public static void main(String[] args) {
		
		ReverseLevelorder tree = new ReverseLevelorder();
		  
        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        reverse(tree.root);
	}
	
	static void reverse(Node node){
		Stack<Node> s=new Stack<Node>();
		Queue<Node> q=new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty()){
			node=q.peek();
			q.remove();
			s.push(node);
			
			if(node.right!=null)
				q.add(node.right);
			if(node.left!=null)
				q.add(node.left);
		}
		
		while(s.empty()==false){
			node=s.peek();
			System.out.print(node.data+" ");
			s.pop();
		}
	}
}
