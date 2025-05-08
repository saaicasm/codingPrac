class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0 
        right = len(numbers) - 1
        res = []
        while(left <= right):
            sum = numbers[left] + numbers[right]
            if sum < target:
                left = left + 1
            elif sum > target:
                right = right - 1
            else:
                res.append(left+1)
                res.append(right+1)
                break
        return res
