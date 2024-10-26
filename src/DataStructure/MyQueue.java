package DataStructure;

public class MyQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    // Constructor to initialize the queue
    public MyQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Add an element to the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedElement = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removedElement;
    }

    // Peek the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        return queue[front];
    }

    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println("Front element is: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        queue.enqueue(1);
        queue.enqueue(26);

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Queue size is: " + queue.getSize());
    }
}