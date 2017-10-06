
public class UboundedKnapsack {
	
	public static void main(String[] args) {
		int W = 100;
	    int val[] = {10, 30, 20};
	    int wt[] = {5, 10, 15};
		int n=val.length;
		System.out.println(unboundedKnapsack(W,n,val,wt));
	}

	private static int unboundedKnapsack(int W, int n, int[] val, int[] wt) {
		// TODO Auto-generated method stub
		int dp[]=new int[W+1];
		
		for(int i=0;i<=W;i++){
			for(int j=0;j<n;j++){
				if(wt[j]<=i){
					dp[i]=max(dp[i],dp[i-wt[j]]+val[j]);
				}
			}
		}
		return dp[W];
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return (i>j)?i:j;
	}

}
