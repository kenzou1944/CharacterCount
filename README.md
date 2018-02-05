# CharacterCount

Insertion Sort. Given a file contains a list of English words, your tasks is to construct a linked list (in
ascending order) for the words. Your linked list must have a dummy node that is pointed by the listHead.



Algorithm steps for the implementation of this project:

Step 0: initialize linked List with a dummy node, pointed by head

Step 1: set count to zero to allow only 14 insertions within while loop.

Step 2: read data using scanner from input file to variable sc.

Step 3: store sc in a String variable to be inserted into list.

Step 4: Call append function within linked list class.

Step 5: check to see if the pointer next in List Head is null, if so then reassign pointer next to new node.

Step 6: If list is not empty, create a current node equal to dummy of list and only enter while loop if pointer next isn’t null, and the current string is less then new data string.

Step 7: when while loop condition is false, that means either current node reach to the end of list or a new node needs to be inserted there.

Step 8: call Print function to print the current list to output file.

Step 9: repeat step 2-8, while there is less then 15 node.

Step 10: close file.
