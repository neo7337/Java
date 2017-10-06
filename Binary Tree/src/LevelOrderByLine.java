import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderByLine {
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int item){
			data=item;
			left=null;
			right=null;
		}
	}
	
	public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
         
        printLevelOrder(root);
	}

	private static void printLevelOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null){
			return;
		}
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		
		while(true){
			int nodecount=q.size();
			
			if(nodecount==0)
				return;
			
			while(nodecount>0){
				Node node=q.peek();
				System.out.print(node.data+" ");
				q.remove();
				if(node.left!=null)
					q.add(node.left);
				if(node.right!=null)
					q.add(node.right);
				nodecount--;
			}
			System.out.println("");
			
		}
	}

}
