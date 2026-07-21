package rampexday24.classtask;

import java.util.NoSuchElementException;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();

        // Testing insertions
        li.insertAtEnd(10);
        li.insertAtbeginning(5);
        li.insertAtEnd(20);
        li.insertAtPos(1, 7); // 5 -> 7 -> 10 -> 20

        System.out.print("Before deletion: ");
        li.display();

        // Testing deletion
        li.deleteAtPos(0); // Deletes 5

        System.out.print("After deletion: ");
        li.display();
    }
}

class LinkList {
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
            insertAtbeginning(val); // Reuse method to handle size correctly
        } else {
            Node newnode = new Node(val);
            Node temp = head;
            while (temp.next != null) { // Safer way to find the last node
                temp = temp.next;
            }
            temp.next = newnode;
            size++;
        }
    }

    public void insertAtPos(int index, int value) throws NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException("Index value is not valid");
        }

        if (index == 0) {
            insertAtbeginning(value);
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
        if (isEmpty()) {
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
        size--; // Decrement size globally at the end of deletion
    }

    public void display() {
        Node temp = head;
        while (temp != null) { // Loop until the end of the list
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return head == null;
    }

    class Node {
        int val;
        Node next;
        Node(int value) {
            val = value;
        }
    }
}