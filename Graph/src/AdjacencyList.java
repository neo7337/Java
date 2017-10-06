import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class AdjacencyList {
	node head;
	
	static class node{
		int data;
		node next;
	}
	
	private ArrayList<Integer> vertices;
	private node[] edges;
	private int vertexCount=0;
	
	public AdjacencyList(int vertexCount) {
		// TODO Auto-generated constructor stub
		this.vertexCount=vertexCount;
		vertices=new ArrayList<Integer>();
		edges=new node[vertexCount];
		for(int i=0;i<vertexCount;i++){
			vertices.add(i);
			edges[i]=new node();
		}
	}
	
	public void addEdge(int u, int v){
		node nd=new node();
		nd.data=v;
		nd.next=edges[u];
		edges[u]=nd;
		
		node node_v=new node();
		node_v.data=u;
		node_v.next=edges[v];
		edges[v]=node_v;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		AdjacencyList graph=new AdjacencyList(n);
		
		graph.addEdge(1, 3);
		graph.addEdge(1, 2);
	    graph.addEdge(2, 3);
	    
	    
	    graph.printGraph();
	}

	private void printGraph() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("Edges: ");
		
		for(int i=0;i<vertexCount;i++){
			node temp=edges[i];
			System.out.print(i);
			System.out.print(" -> ");
			while(temp!=null){
				System.out.print(temp.data);
				System.out.print(" -> ");
				temp=temp.next;
			}
			System.out.println("null");
		}
		
	}
}
