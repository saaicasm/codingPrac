# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


def sumOfLinkedLists(linkedListOne, linkedListTwo):
    # Write your code here.
    dummy = LinkedList(0)
    curr = dummy
    carry = 0
    
    node1 = linkedListOne
    node2 = linkedListTwo

    while node1 is not None or node2 is not None or carry != 0:
        value1 = node1.value if node1 is not None else 0
        value2 = node2.value if node2 is not None else 0
        sumOfValues = value1 + value2 + carry

        newValue = sumOfValues % 10
        newNode = LinkedList(newValue)
        curr.next = newNode
        curr = newNode

        carry = sumOfValues // 10
        node1 = node1.next if node1 is not None else None
        node2 = node2.next if node2 is not None else None

    
    return dummy.next
