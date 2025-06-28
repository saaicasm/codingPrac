package QnS;

import java.util.LinkedList;
import java.util.Queue;

public class QnBFS {
	    private static final int INF = 2147483647;
	    
	    public void wallsAndGates(int[][] rooms) {
	        
	        Queue<int[]> q = new LinkedList<>(); 
	        
	        int rows = rooms.length;
	        int cols = rooms[0].length;
	        
	        for (int r = 0; r < rows; r++) {
	            for(int c = 0; c < cols; c++) {
	                if (rooms[r][c] == 0) {
	                    q.offer(new int[]{r,c});
	                }
	            }
	        }
	        
	        int[][] directions = {
	            {1, 0},
	            {0,1},
	            {-1,0},
	            {0,-1}
	        };
	        
	        while(!q.isEmpty()) {
	            int[] gate = q.poll();
	            int r = gate[0];
	            int c = gate[1];
	            
	            for (int[] dir:directions) {
	                int newR = r + dir[0];
	                int newC = c + dir[1];
	                
	                if (newR < 0 || newR >= rows || newC < 0 || newC >= cols) {
	                    continue;
	                }
	                if (rooms[newR][newC] == 0 || rooms[newR][newC] == -1) {
	                    continue;
	                }
	                
	                if(rooms[newR][newC] > rooms[r][c] + 1) {
	                    rooms[newR][newC] = rooms[r][c] + 1;
	                    q.offer(new int[]{newR, newC});
	                }
	                
	            }
	            
	        }    
	    }
}
