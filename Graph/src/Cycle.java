
public class Cycle {
	
	int V,E;
	Edge edge[];
	
	class Edge{
		int src,dest;
	}
	
	Cycle(int v,int e){
		V=v;
		E=e;
		edge=new Edge[E];
		for(int i=0;i<e;i++){
			edge[i]=new Edge();
		}
	}
	
	int find(int parent[], int i){
		if(parent[i]==-1){
			return i;
		}
		return find(parent,parent[i]);
	}
	
	void union(int parent[], int x, int y){
		int xset=find(parent,x);
		int yset=find(parent,y);
		parent[xset]=yset;
	}
	
	int iscycle(Cycle cycle){
		int parent[]=new int[cycle.V];
		for(int i=0;i<cycle.V;++i){
			parent[i]=-1;
		}
		
		for(int i=0;i<cycle.E;i++){
			int x=cycle.find(parent, cycle.edge[i].src);
			int y=cycle.find(parent, cycle.edge[i].dest);
			
			if(x==y)
				return 1;
			
			cycle.union(parent,x,y);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		int V=3,E=2;
		Cycle cycle=new Cycle(V,E);
		
		cycle.edge[0].src=0;
		cycle.edge[0].dest=1;
		
		cycle.edge[1].src=1;
		cycle.edge[1].dest=2;
		
		/*cycle.edge[2].src=0;
		cycle.edge[2].dest=2;*/
		
		if(cycle.iscycle(cycle)==1)
			System.out.println("Cycle");
		else
			System.out.println("No Cycle");
	}

}
