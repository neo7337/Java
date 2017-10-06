import java.util.Iterator;
import java.util.LinkedList;


public class BFS {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	//initialising the linked list 
	BFS(int v){ 
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList();
		}
	}
	
	//adding the edges to the graph
	void addEdge(int v,int w){
		adj[v].add(w);
	}
	
	void bfs(int s){
		
		//default marking of all the vertices as false
		boolean visited[]=new boolean[V];
		
		//create a queue for BFS
		LinkedList<Integer> queue=new LinkedList<Integer>();
		
		//mark the current node as visited and enqueue it
		visited[s]=true;
		queue.add(s);
		
		while(queue.size()!=0){
			
			//dequeue a vertex from the queue and print it
			s=queue.poll();
			System.out.print(s+" ");
			
			//get all the adjacent vertices of the dequeued vertex
			//if adjacent vertex is not visited then mask it visited and enqueue it
			Iterator<Integer> i=adj[s].listIterator();
			while(i.hasNext()){
				int n=i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BFS g=new BFS(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("following is the breadth first traversal (starting from vertex 2)");
        
        g.bfs(2) ;
	}

}
