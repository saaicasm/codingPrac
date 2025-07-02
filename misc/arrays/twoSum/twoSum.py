# approch 1 

array = [3, 5, -4, 8, 11, 1, -1, 6]
targetSum = 10
res = []

for i in range(0, len(array) - 1):
    for j in range(i+1, len(array)):
       if(array[i] + array[j]) == targetSum:
        #    print(array[i], array[j])
           res.append(array[i])
           res.append(array[j])


print(res)


# approch 2

array = [3, 5, -4, 8, 11, 1, -1, 6]
targetSum = 10
res = []
array.sort()

l = 0
r = len(array) - 1

while(l < r):
    if (array[l] + array[r]) < targetSum:
        l = l + 1
    elif (array[l] + array[r]) > targetSum:
        r = r - 1
    else:
        res.append(array[l])
        res.append(array[r])
        break
print(res)

# approch 3 

array = [3, 5, -4, 8, 11, 1, -1, 6]
targetSum = 10
res = []
nums = {}

for num in array:
    curr = targetSum - num
    if curr in nums:
        res.append(curr)
        res.append(num)
    else:
        nums[num] = True

print(res)