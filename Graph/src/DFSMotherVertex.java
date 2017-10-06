import java.util.Iterator;
import java.util.LinkedList;

import com.sun.prism.shader.FillCircle_Color_AlphaTest_Loader;


public class DFSMotherVertex {

private int V;
	
	private LinkedList<Integer> adj[];
	
	DFSMotherVertex(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	void dfsUtil(int v, boolean visited[]){
		visited[v]=true;
		//System.out.println(v+" ");
		
		Iterator<Integer> i=adj[v].listIterator();
		while(i.){
			if(!visited[i]){
				dfsUtil(i,visited);
			}
		}
	}
	
	int findMother(){
		boolean visited[]=new boolean[V];
		int v=0;
		
		for(int i=0;i<V;i++){
			if(visited[i]==false){
				dfsUtil(i,visited);
				v=i;
			}
		}
		
		for(int l=0;l<V;l++){
			visited[l]=false;
		}
		
		dfsUtil(v, visited);
		for(int m=0;m<V;m++){
			if(visited[m]==false){
				return -1;
			}
		}
		return v;
	}
	
	public static void main(String[] args) {
		DFSMotherVertex g=new DFSMotherVertex(7);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 3);
	    g.addEdge(4, 1);
	    g.addEdge(6, 4);
	    g.addEdge(5, 6);
	    g.addEdge(5, 2);
	    g.addEdge(6, 0);
		
		System.out.println("DFS");
		System.out.println(g.findMother());
	}
}
