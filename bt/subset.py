nums = [1, 2, 3]

res = []
subset = []
def dfs(i):
    if(i >= len(nums)):
        res.append(subset.copy())
        return
    subset.append(nums[i])
    dfs(i + 1) 
    


    subset.pop()
    print(subset)
    dfs(i+1)

dfs(0)

