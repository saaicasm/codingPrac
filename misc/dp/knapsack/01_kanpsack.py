# N = 3, W = 4, profit[] = {1, 2, 3}, weight[] = {4, 5, 1}

N = 3
W = 4
profit = [1,2,3]
weight = [4,5,1]

def knapsack(weight, profit, W, N):
    if(N == 0 or W == 0):
        return 0
    
    if(weight[N-1] <= W):
        return max(profit[N-1] + knapsack(weight, profit, W - weight[N-1], N-1), knapsack(weight, profit, W, N-1))
    elif(weight[N-1] > W):
        return knapsack(weight, profit, W, N-1)

print(knapsack(weight, profit, W, N)) 
