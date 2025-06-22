package SlidingWindow;

public class ConsOnes {
	public static int consecutiveOnes(int[] nums, int k) {
		
		int left = 0;
		int right = 0;
		
		while(right < nums.length) {
			
			if(nums[right] == 0) k--;
			if(k < 0) {
				if (nums[left] == 0) {
					k++;
				}
				left++;
			}
			
			
			right++;
		}
		
		return right - left;
	}
}
