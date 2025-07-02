# Tip: You can use the type(element) function to check whether an item
# is a list or an integer.
def productSum(array,mul = 1):
    # Write your code here.
    total = 0
    for i in array:
        if type(i) is int:
            total += i
        else:
            total += productSum(i, mul + 1)
    return mul * total