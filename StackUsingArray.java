import java.util.Scanner;

public class StackUsingArray {
    // Define a stack with a fixed size
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public StackUsingArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // Stack is empty initially
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    // Pop method to remove an element from the stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No elements to pop.");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    // Peek method to view the top element of the stack without removing it
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to display the elements of the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask for stack size
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();

        // Create a stack object with the given size
        StackUsingArray stack = new StackUsingArray(size);

        while (true) {
            // Menu for operations
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Push operation
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    // Pop operation
                    stack.pop();
                    break;

                case 3:
                    // Peek operation
                    stack.peek();
                    break;

                case 4:
                    // Display the current stack
                    stack.display();
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