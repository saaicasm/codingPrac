package SlidingWindow;

public class LstSubDelOne {
	
	public static int longestSubarrDelOne(int[] nums) {
		
		int left = 0;
		int right = 0;
		int k = 1;
		int ans = 0;
		while(right < nums.length) {
			if (nums[right] == 0) k--;
			if (k < 0) {
				if(nums[left] == 0) {
					k++;
				}
				left++;
			}
			ans = Math.max(ans, right-left);
			right++;
		}
		
		return ans;
	}
	
}
