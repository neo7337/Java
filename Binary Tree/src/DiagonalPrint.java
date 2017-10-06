import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;


public class DiagonalPrint {

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
		
		Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
         
        diagonalPrint(root);
	}

	private static void diagonalPrint(Node root) {
		// TODO Auto-generated method stub
		HashMap<Integer,Vector<Integer>> d=new HashMap<>();
		diagonalPrintUtil(root,0, d);
		
		System.out.println("diagonal");
		for(Entry<Integer, Vector<Integer>> entry: d.entrySet()){
			System.out.println(entry.getValue());
		}
	}

	private static void diagonalPrintUtil(Node root, int i,
			HashMap<Integer, Vector<Integer>> d) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		
		Vector<Integer> k=d.get(i);
		if(k==null){
			k=new Vector<>();
			k.add(root.data);
		}else{
			k.add(root.data);
		}
		
		d.put(i,k);
		diagonalPrintUtil(root.left,i+1,d);
		diagonalPrintUtil(root.right,i,d);
	}
	

}
