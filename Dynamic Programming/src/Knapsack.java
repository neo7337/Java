
public class Knapsack {
	
	static int max(int a, int b){
		return (a>b)?a:b;
	}
	
	static int knapSack(int W, int wt[], int val[], int n){
		int i,w;
		int k[][]=new int[n+1][W+1];
		
		for(i=0;i<=n;i++){
			for(w=0;w<=W;w++){
				if(i==0 || w==0){
					k[i][w]=0;
					System.out.print("["+i+"]["+w+"]: "+k[i][w]+" ");	
				}
				else if(wt[i-1]<=W){
					k[i][w]=max(val[i-1]+k[i-1][W-wt[i-1]],k[i-1][w]);
					System.out.print("["+i+"]["+w+"]: "+k[i][w]+" ");				}
				else{
					k[i][w]=k[i-1][w];
					System.out.print("["+i+"]["+w+"]: "+k[i][w]+" ");	
				}
			}
			System.out.println("");
		}
		return k[n][W];
	}
	
	public static void main(String[] args) {
		int val[]=new int[]{1,30};
		int wt[]=new int[]{1,50};
		int W=100;
		int n=val.length;
		System.out.println(knapSack(W,wt,val,n));
	}

}
