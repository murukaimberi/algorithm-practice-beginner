package za.co.afrikatek.algorithmsbeginnerexercise.lists;

public class SinglyLinkedList<T> {
    // Node inner class for SLL
    public class Node {
        public T data;
        public Node nextNode;
    }

    public Node headNode; // head node of the linked list
    public int size; // size of the linked list

    //Constructor - initializes headNode and size
    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    // Helper Function that checks if the list is empty or not
    public boolean isEmpty() {
        if(headNode == null) {
            return true;
        }
        return false;
    }

    //Inserts new data at the start of the linked list
    public void insertAtHead(T data) {
        // Create the node
        Node newNode = new Node();
        newNode.data = data;

        // linking the node with the head
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    // Helper Function to printList
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node temp = headNode;
        System.out.println("List : ");
        while (temp.nextNode != null) {
            System.out.println(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }

    //Inserting data at the end of the linked list
    public void insertAtTail(T data) {
        // if the list is empty the call insertAtHead()
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        // Creating a new Node with value data
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node last = headNode;
        // iterate to the last element
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        // make newNode the next element of the last node
        last.nextNode = newNode;
        size++;
    }

    // inserts data after the given prev data node
    public void insertAfter(T data, T previous) {
        // Create a new Node with value data
        Node newNode = new Node();
        newNode.data = data;
        // Start from the head node
        Node currentNode = this.headNode;
        // traverse the list until node has data equal to previous is found
        while (currentNode != null && !currentNode.data.equals(previous)) {
            currentNode = currentNode.nextNode;
        }
        // If such a node was found
        // then point our new node to current Node's next element
        if (currentNode != null) {
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
            size++;
        }
    }
}
