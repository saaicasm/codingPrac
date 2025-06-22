package SlidingWindow;

public class Driver {
	
	public static void main(String[] args) {
		
		//Max Vowels
		
		String s = "abciiidef";
		int k = 3;
		
		
		int answer = MaxVowels.maxVowels(s, k);
		
		//Consecutive Ones
		
		int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		k = 2;
		
		answer = ConsOnes.consecutiveOnes(nums, k);
		
		
		//Consecutive Ones
		
		int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
		k = 1;
		
		answer = LstSubDelOne.longestSubarrDelOne(nums2);
		
		
		int[] nums3 = {1,12,-5,-6,50,3};
		k = 4;
		
		System.out.println(MaxAvg.maxAverage(nums3, k));
		
		
		
	}
	
}
