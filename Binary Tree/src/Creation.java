
public class Creation {
	
	static node root;
	
	static class node{
		
		int key;
		String name;
		
		node lchild;
		node rchild;
		
		node(int key, String name){
			this.key=key;
			this.name=name;
		}
		
		public String toString(){
			return name+" has the key "+key;
		}
	}
	
	
	public static void main(String[] args) {
		
		Creation tree=new Creation();
		
		tree.add(50,"A");
		tree.add(24,"B");
		tree.add(12,"C");
		tree.add(30,"D");
		tree.add(75,"E");
		tree.add(88,"F");
		
		System.out.println("POST ORDER TRAVERSAL");
		tree.postordertrav(root);
		//System.out.println("Node with the key 75");
		//System.out.println(tree.findNode(75));
		System.out.println("PREORDER TRAVERSAL");
		tree.preordertrav(root);
		System.out.println("IN ORDER TRAVERSAL");
		tree.inordertrav(root);
	}


	private void inordertrav(node root2) {
		// TODO Auto-generated method stub
		if(root2!=null){
			inordertrav(root2.lchild);
			System.out.println(root2);
			inordertrav(root2.rchild);
		}
		
	}


	private void postordertrav(node root2) {
		// TODO Auto-generated method stub
		if(root2!=null){
			postordertrav(root2.lchild);
			postordertrav(root2.rchild);
			System.out.println(root2);
		}
		
	}
	
	private void preordertrav(node root3){
		if(root3!=null){
			System.out.println(root3);
			preordertrav(root3.lchild);
			preordertrav(root3.rchild);
			
		}
	}


	private void add(int i, String string) {
		// TODO Auto-generated method stub
		
		node new_node=new node(i,string);
		
		if(root==null){
			root=new_node;
		}else{
			node focusNode=root;
			
			node parent;
			
			while(true){
				parent=focusNode;
				
				if(i<focusNode.key){
					focusNode=focusNode.lchild;
					if(focusNode==null){
						parent.lchild=new_node;
						return;
					}
				}
				else{
					focusNode=focusNode.rchild;
					if(focusNode==null){
						parent.rchild=new_node;
						return;
					}
				}
			}
		}
		
	}
	
	

}
