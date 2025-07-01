package QnS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class OpenLock {
	
	public int openLock(String[] deadend, String target) {
		Map<Character, Character> nextC = Map.of(
	            '0','1',
	            '1','2',
	            '2','3',
	            '3','4',
	            '4','5',
	            '5','6',
	            '6','7',
	            '7','8',
	            '8','9',
	            '9','0'
	        );
	   
		Map<Character, Character> prevC = Map.of(
	            '0','9',
	            '1','0',
	            '2','1',
	            '3','2',
	            '4','3',
	            '5','4',
	            '6','5',
	            '7','6',
	            '8','7',
	            '9','8'
	        );
		
		Set<String> visited = new HashSet<>(Arrays.asList(deadend));
		Queue<String> pending = new LinkedList<String>();
		
		
		int turns = 0;
		
		pending.add("0000");
		visited.add("0000");
		
		while(!pending.isEmpty()) {
			
			int currSize = pending.size();
			
			for (int i = 0; i < currSize; i++) {
				
				String curr = pending.poll();
				
				if (curr.equals(target)) return turns;
				
				for (int w = 0; w < 4; w++) {
					
					StringBuilder nextcurr = new StringBuilder(curr);
					
					if(!visited.contains(nextcurr.toString())) {
						pending.add(nextcurr.toString());
						visited.add(nextcurr.toString());
					}
					
					StringBuilder prevcurr = new StringBuilder(curr);
					
					if(!visited.contains(prevcurr.toString())) {
						pending.add(prevcurr.toString());
						visited.add(prevcurr.toString());
					}

				}				
				
			}
			
			turns += 1;
			
		}
		
		
		
		return -1;
	}


	
}
