package SlidingWindow;

public class MaxAvg {
	public static double maxAverage(int[] nums, int k) {
		
		int left=0, right=0;
		double sum = 0;
		
		for (;right < k; right++) {
			sum += nums[right];
		}
		
		double maxAvg = sum / k;
		
		while (right < nums.length) {
			sum += nums[right] - nums[left];
			left++;
			right++;
			
			maxAvg = Math.max(maxAvg,sum/k);
			
		}
		
		
		
		return maxAvg;
	}
}
