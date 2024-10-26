package DataStructure;

public class LinkedListQueue {
    // Node class to represent each element in the queue
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;
    private int size;

    // Constructor to initialize the queue
    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedElement = front.data;
        front = front.next;
        if (front == null) {  // If the queue becomes empty, set rear to null
            rear = null;
        }
        size--;
        return removedElement;
    }

    // Peek the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        return front.data;
    }
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
                queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println("Front element is: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Enqueue more elements
        queue.enqueue(1);
        queue.enqueue(26);

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Queue size is: " + queue.getSize());
    }
}