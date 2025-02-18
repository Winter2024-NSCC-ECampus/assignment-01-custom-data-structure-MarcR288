import java.sql.SQLOutput;

public class DataStructure {

    private Node head;

    public DataStructure() {
        head = null;
    }

    //1.adds a new node containing value to the end of the list
    public void append(int value) {
        // Create a new node
        Node newNode = new Node(value, null);
        if (head == null) {
            // If list is empty, make newNode the head
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                // Get to the last node
                current = current.next;
            }
            // Add the new node at the end
            current.next = newNode;
        }
    }

    //2.adds a new node containing value to the start of the list
    public void prepend(int value) {
        // Create a new node, and link it to the current head
        Node newNode = new Node(value, head);
        //Make the new node the head of the list
        head = newNode;
    }

    //3.returns the total number of nodes in the list
    public int size() {
        int count = 0;
        Node current = head;
        //while there is another item in the list
        while (current != null) {
            //increase count
            count++;
            // Move to the next node
            current = current.next;
        }
        System.out.println(count);
        return count;
    }

    //4.retruns the first node in the list
    public Node head() {
        System.out.println(head.data);
        return head;
    }

    //5.returns the last node in the list
    public Node tail() {
        if (head == null) {
            return null;
        }
        Node current = head;
        // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }
        System.out.println(current.data);
        return current;  // Return the last node
    }

    //6.returns the node at the given index
    public Node at(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                System.out.println(current.data);
                return current;
            }
            count++;
            current = current.next;
        }
        return null;
    }

    //7.removes the last element from the list
    public void pop() {
        if (head == null) {
            return;
        }

        if(head.next == null) {
            head = null;
        }

        Node current = head;
        // Traverse to the second to last node
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }
        // Make last node null
        current.next = null;
    }

    //8.returns true if the passed in value is in the list and otherwise returns false.
    public boolean contains(int value) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                System.out.println("true");
                return true;
            }
            current = current.next;
           }
        System.out.println("false");
        return false;
    }

    //9.returns the index of the node containing value, or nil if not found
    public int find(int value) {
        int count = 0;
        if (head == null) {
            System.out.println("nil");
            return -1;
        }
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                System.out.println(count);
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }

    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
