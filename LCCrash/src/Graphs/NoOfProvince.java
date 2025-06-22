package Graphs;

public class NoOfProvince {
	
	public void dfs(int node, int[][] isConnected, boolean[] visit) {
		visit[node] = true;
		for (int i=0; i < isConnected.length; i++) {
			if(isConnected[node][i] == 1 && !visit[i]) {
				dfs(i, isConnected, visit);
			}
		}
	}
	
	
	
	public int noOfProvince(int[][] isConnected) {
		
		int n = isConnected.length;
		boolean[] visit = new boolean[n];
		int numberOfProvince = 0;
		
		for (int i=0; i < n; i++) {
			if(!visit[i]) {
				numberOfProvince++;
				dfs(i, isConnected, visit);
			}
		}
		
		return numberOfProvince;
	}
	
}
