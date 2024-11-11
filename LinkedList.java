class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Function to reverse the linked list in place
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next; // Temporarily store the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current;      // Move previous to this node
            current = nextNode;      // Move to the next node
        }

        head = previous; // Update head to the new front of the list
    }

    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed List:");
        list.printList();
    }
}
