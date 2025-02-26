def selectionSort(array):
    # Write your code here.
    for i in range(len(array) - 1):
        min = i
        for j in range(i+1, len(array)):
            if array[min] > array[j]:
                min = j
        array[min], array[i] = array[i], array[min]
    return array
    pass
