public class Implementation_LinkedListStack {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class LinkedListStack {
        private Node top; // top element of stack, initiallty empty
        private int size; // to tack size of stack

        private LinkedListStack() {
            top = null; // initially stack is empty so null
            size = 0;
        }

        public void push(int element) {
            Node newNode = new Node(element);
            newNode.next = top;
            top = newNode;
            size++;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int size() {
            return size; //O(1)
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty.");
            }
            int topvalue = top.data;
            top = top.next;
            size--;
            return topvalue;
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty.");
            }
            return top.data;
        }

        public void display() {
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        s.display(); // will print in reverse as LIFO  order 
    }
}
