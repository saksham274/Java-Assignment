import java.util.Scanner;

public class QueueUsingArray {
    private int[] queue;
    private int front, rear, capacity;
    
    // Constructor to initialize the queue with a given size
    public QueueUsingArray(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Method to add an element to the queue (enqueue operation)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
        } else {
            queue[++rear] = value;
            System.out.println(value + " enqueued to the queue");
        }
    }

    // Method to remove an element from the queue (dequeue operation)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No elements to dequeue.");
        } else {
            System.out.println(queue[front] + " dequeued from the queue");
            front++;
        }
    }

    // Method to peek at the front element of the queue without removing it
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is: " + queue[front]);
        }
    }

    // Method to display all elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask for queue size
        System.out.print("Enter queue size: ");
        int size = scanner.nextInt();

        // Create a Queue object
        QueueUsingArray queue = new QueueUsingArray(size);

        while (true) {
            // Menu for operations
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Enqueue operation
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    // Dequeue operation
                    queue.dequeue();
                    break;

                case 3:
                    // Peek operation
                    queue.peek();
                    break;

                case 4:
                    // Display the current queue
                    queue.display();
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

