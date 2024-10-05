class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        min_cost = 0
        if cost[0] >= cost[1]:
            node = cost[1]
            i = 1
        else:
            node = cost[0]
            i = 0
        min_cost += node
        if(len(cost) < 4):
            return cost[1]
        # Iterate through the cost list and pick the minimum cost to climb
        while i <= len(cost) - 3:  # We need to stop at least 2 steps before the end
            l = cost[i + 1]
            r = cost[i + 2]
            if r <= l:
                node = r
                i += 2  # Move two steps if r is chosen
            else:
                node = l
                i += 1  # Move one step if l is chosen
            min_cost += node  # Accumulate the cost
        return min_cost