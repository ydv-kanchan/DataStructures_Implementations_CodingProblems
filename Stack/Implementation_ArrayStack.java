public class Implementation_ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    public Implementation_ArrayStack(int n) {
        capacity = n;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int element) {
        if (isFull()) {
            resize(); // auto resize when full
        }
        stack[++top] = element;
        System.out.println(element + " pushed to stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! No element to pop.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No element to peek.");
            return -1;
        }
        return stack[top];
    }

    public int size() {
       return top + 1;
    }
    
    private void resize() {
        int newCapacity = capacity * 2;
        int[] newStack = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;
        System.out.println("Stack resized to capacity: " + capacity);
    }

    public static void main(String[] args) {
        Implementation_ArrayStack s = new Implementation_ArrayStack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40); // will trigger resize
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Size: " + s.size());
    }
}
