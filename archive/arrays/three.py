array = [12, 3, 1, 2, -6, 5, -8, 1]
targetSum = 0


def threeNumberSum(array, targetSum):
    array.sort()
    res = []

    for i in range(len(array)):
        twoSum(array, i, res, targetSum)
    return res

def twoSum(array, i, res, targetSum):
    l, r = i+1, len(array)-1

    while l<r:
        if array[i] + array[l] + array[r] < targetSum:
            l += 1
        elif array[i] + array[l] + array[r] > targetSum:
            r -= 1
        else:
            res.append([array[i], array[l], array[r]])
            l+=1
    return res

print(threeNumberSum(array, targetSum))
