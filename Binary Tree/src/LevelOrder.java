import java.util.LinkedList;
import java.util.Queue;




public class LevelOrder {
	
	static class Node{
		int data;
		Node left,right;
		public Node(int item){
			data=item;
			left=null;
			right=null;
		}
	}

	public static void main(String[] args) {
		Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right.right = new Node(6);
        
        System.out.println("levelorder traversal");
        printLevelOrder(tree);
	}
	
	static void printLevelOrder(Node root){
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp=q.poll();
			System.out.print(temp.data+" ");
			
			if(temp.left!=null){
				q.add(temp.left);
				//System.out.print(temp.left.data+" ");
			}
			if(temp.right!=null){
				q.add(temp.right);
				//System.out.print(temp.right.data+" ");
			}
			//System.out.println("");
		}
	}
}
