class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    rob(nums) {
        const len = nums.length;
        
        if (len === 0) return 0; // No houses to rob
        if (len === 1) return nums[0]; // Only one house to rob
        
        // Helper function to calculate max robbery for a linear array
        const maxRob = (houses) => {
            let previous = 0;
            let current = 0;

            for (const amount of houses) {
                const temp = current;
                current = Math.max(previous + amount, current);
                previous = temp;
            }
            return current;
        };

        // We need to consider two scenarios: excluding the first house or the last house
        return Math.max(maxRob(nums.slice(1)), maxRob(nums.slice(0, len - 1)));
    }
}
