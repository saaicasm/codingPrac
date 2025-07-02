def bubbleSort(array):
    # Write your code here.
    end = len(array) - 1
    noSwap = False

    while not noSwap:
        noSwap = True
        for i in range(0, end):
            if array[i] > array[i+1]:
                array[i], array[i+1] = array[i+1], array[i]
                noSwap = False
        end = end - 1
    return array
