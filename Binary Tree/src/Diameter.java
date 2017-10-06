
public class Diameter {
	
	Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int item){
			data=item;
			left=null;
			right=null;
		}
	}
	
	class Height{
		int h;
	}
	
	public static void main(String[] args) {
		
		Diameter tree = new Diameter();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("The diameter of given binary tree is : "
                           + tree.diameter());
	}

	private int diameter() {
		// TODO Auto-generated method stub
		Height height=new Height();
		return diameterOpt(root,height);
	}

	private int diameterOpt(Node root2, Height height) {
		// TODO Auto-generated method stub
		Height lh=new Height();
		Height rh=new Height();
		if(root2==null){
			height.h=0;
			return 0;
		}
		lh.h++;
		rh.h++;
		int ldiameter=diameterOpt(root2.left,lh);
		int rdiameter=diameterOpt(root2.right,rh);
		
		height.h=Math.max(lh.h, rh.h)+1;
		return Math.max(lh.h+rh.h+1, Math.max(ldiameter, rdiameter));
	}

}
