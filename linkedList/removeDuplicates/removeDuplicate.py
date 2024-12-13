# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None

# Function to remove duplicates from a sorted linked list
def removeDuplicatesFromLinkedList(linkedList):
    current = linkedList
    while current and current.next:
        if current.value == current.next.value:
            current.next = current.next.next
        else:
            current = current.next
    return linkedList

# Function to create a linked list from a list of values
def createLinkedList(values):
    if not values:
        return None
    head = LinkedList(values[0])
    current = head
    for value in values[1:]:
        current.next = LinkedList(value)
        current = current.next
    return head

# Function to print a linked list
def printLinkedList(linkedList):
    current = linkedList
    while current:
        print(current.value, end=" --> " if current.next else "\n")
        current = current.next

# Create the linked list with duplicate values
values = [1, 1, 3, 3, 4, 4, 4, 5, 6, 6]
linkedList = createLinkedList(values)

# Print the initial linked list
print("Initial Linked List:")
printLinkedList(linkedList)

# Remove duplicates and print the result
linkedList = removeDuplicatesFromLinkedList(linkedList)
print("\nLinked List after removing duplicates:")
printLinkedList(linkedList)
