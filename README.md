Main Class: Demonstration of DataStructure Operations
Description
The Main class is a demonstration of how to use the methods of the DataStructure class, which is a basic implementation of a singly linked list. It shows how to manipulate the linked list by appending, prepending, retrieving nodes, and performing various operations on the list.

DataStructure Class
Description
The DataStructure class is a basic implementation of a singly linked list. It provides methods to add, remove, and interact with nodes in the list, including operations to append, prepend, check the size, find specific elements, and more.

Table of Contents
Methods
Usage Example
Node Class
License
Methods
1. append(int value)
Adds a new node containing the specified value to the end of the list.

2. prepend(int value)
Adds a new node containing the specified value to the beginning of the list.

3. size()
Returns the total number of nodes in the list.

4. head()
Returns the first node (head) in the list.

5. tail()
Returns the last node in the list.

6. at(int index)
Returns the node at the specified index. If the index is out of bounds, returns null.

7. pop()
Removes the last node from the list.

8. contains(int value)
Returns true if the list contains the specified value, otherwise returns false.

9. find(int value)
Returns the index of the node containing the specified value. Returns -1 if the value is not found.

10. printList()
Prints the entire list, displaying the data values of all nodes.

Node Class
The Node class represents a single element in the linked list, holding a data value and a reference to the next node.
