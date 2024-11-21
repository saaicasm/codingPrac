array = [12, 3, 1, 2, -6, 5, -8, 6]
targetSum = 0
res = []
array.sort()



def twoSum (arr, target, a):
    l = 0
    r = len(arr) - 1

    while (l < r):
        if(arr[l] + arr[r]) < target:
            l += 1
        elif(arr[l] + arr[r]) > target:
            r -= 1
        else:
            res.append([a, arr[l], arr[r]])
            l += 1

for i in range(0, len(array) - 1):
    a = array[i]
    target = targetSum - a
    arr = array[i+1:]
    twoSum(arr, target, a)

print(res)