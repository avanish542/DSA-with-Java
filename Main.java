class StackDSA {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor
    StackDSA(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        StackDSA stack = new StackDSA(5);   // Object creation

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());

        stack.display();
    }
}