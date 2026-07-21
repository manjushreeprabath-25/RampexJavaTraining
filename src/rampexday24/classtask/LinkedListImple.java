package rampexday24.classtask;

import java.util.NoSuchElementException;

public class LinkedListImple {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();

        li.insertAtPos(0, 105);
        li.insertAtPos(1, 106);
        li.insertAtPos(2, 202);
        li.insertAtPos(3, 204);

        li.deleteAtPos(0);

        // Changed from 6 to a valid index (3) to prevent the crash
        li.insertAtPos(3, 204);

        li.display();
    }
}

class Node {
    int val;
    Node next;
    Node(int value) {
        val = value;
    }
}

class LinkedList {
    Node head;
    int size;

    public void insertAtbeginning(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        if (head == null) {
            insertAtbeginning(val);
        } else {
            Node newnode = new Node(val);
            Node temp = head;
            while (temp.next != null) { // Safer dynamic termination
                temp = temp.next;
            }
            temp.next = newnode;
            size++;
        }
    }

    public void insertAtPos(int index, int value) throws NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException("Index value is not valid. Current size is " + size);
        }

        if (index == 0) {
            insertAtbeginning(value); // This increments size internally
        } else {
            Node newnode = new Node(value);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            size++; // Only increment here if insertAtbeginning wasn't called
        }
    }

    public void deleteAtPos(int index) {
        if (head == null) {
            throw new IllegalStateException("Linked List is Empty");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) { // Loops completely through all nodes
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
