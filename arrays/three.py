arr = [12, 3, 1, 2, -6, 5, -8, 1]
t = 0

arr.sort()

i = 0


while(i < len(arr) - 1):
    left = i + 1
    right = len(arr) - 1
    print(arr[left] + arr[right] + arr[i])
    i = i + 1