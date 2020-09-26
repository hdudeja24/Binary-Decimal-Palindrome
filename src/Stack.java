import java.util.NoSuchElementException;

public class Stack<Type> implements StackInterface <Type>{
    private class Node {
        private final Type value;
        private Node next;
        Node (Type value) {
            this.value = value;
            next = null;
        }
    }

    private int size;                   // Keep track of the size of the stack
    private Node top;                   // Keep track of the node at the top of the stack

    public Stack(){
        // Create an empty stack
        top = null;
        size = 0;
    }

    @Override
    public void push(Type item) {
        Node oldTop = top;              // We remember the top of the stack before moving the top
        Node newTop = new Node(item);   // We create a new node for the new top of stack
        top = newTop;                   // Set the new top
        top.next = oldTop;              // Link the old top to the new top
        size++;                         // Update size of the stack
    }

    @Override
    public Type pop() {
        // First we check if the stack is empty then we throw underflow error
        if(empty())
            throw new NoSuchElementException("Stack Underflow");
        else{
            Type value = top.value;     // Saving the current top value before removing it
            top = top.next;             // Save the next node as the current top
            size--;                     // Update the size of the stack
            return value;               // Return the old top
        }
    }

    @Override
    public Type peek() {
        // First we check if the stack is empty then we throw underflow error
        if(empty())
            throw new NoSuchElementException("Stack Underflow");
        // Return the top value of the stack
        else
            return top.value;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public int search(Type item) {
        // First we check if the stack is empty then we throw underflow error
        if(empty())
            throw new NoSuchElementException("Stack Underflow");
        else {
            int count = 1;              // Keep track of distance to the top of the stack
            Node remTop = top;          // Remember the top before iterating through the stack
            while(top != null){         // Iterate until the we fall off the stack
                if(top.value == item)   // If the item we are searching for is found
                {
                    top = remTop;       // Set the top to the one before iterating
                    return count;       // Return the distance to the top of the stack
                }
                else                    // Else the current node doesn't contain the item we are searching for
                {
                    top = top.next;     // We move to the next node
                    count++;            // Update the distance to the top of the stack
                }
            }
            // we get here if we iterate through the whole stack and never found the item
            top = remTop;               // Set the top to the one before iterating
            return -1;                  // We return -1 if we never found the item
        }

    }
}
