package rampexday24.classtask;



    public class LinkedListIm {
        public static void main(String[] args) {
            Node n1 = new Node(4); // Unused node
            LinkedList li = new LinkedList();

            li.insertAtPos(0, 105);
            li.insertAtPos(1, 106);
            li.insertAtPos(1, 202); // List becomes: 105 -> 202 -> 106

            li.display();
        }
    }

    class Nodeee {
        int val;
        Node next;

        Nodeee(int value) {
            val = value;
        }
    }

    class Listt {
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
                while (temp.next != null) { // Safe approach to locate the last item
                    temp = temp.next;
                }
                temp.next = newnode;
                size++;
            }
        }

        public void insertAtPos(int index, int value) {
            if (index == 0) {
                insertAtbeginning(value); // Increments size inside this function
            } else {
                Node newnode = new Node(value);
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
                size++; // Only increments size for non-zero indices
            }
        }

        public void deleteAtPos(int index) {
            if (head == null) {
                return; // Nothing to delete
            }

            if (index == 0) {
                head = head.next;
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                if (temp.next != null) {
                    temp.next = temp.next.next;
                }
            }
            size--;
        }

        public void display() {
            Node temp = head;
            while (temp != null) { // Dynamically loops through every present item
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

