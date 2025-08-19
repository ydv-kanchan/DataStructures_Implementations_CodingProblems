import java.util.LinkedList;
import java.util.Queue;

// Interview question : imlement stack using queue.
//Approach 1: pop costly solution, here pop is O(n), top is O(1) and push is O(1)

public class Implementation_StackDoubleQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    //no need to make size and isEmpty because Queue already have these functions
    //isEmpty works same way for both the DS: Stack & Queue
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int popped = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.peek();
        q2.add(q1.remove());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public int size() {
        return q1.size();
    }

    public static void main(String[] arg) {
        Implementation_StackDoubleQueue s = new Implementation_StackDoubleQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Top element: " + s.top());
        
        System.out.println("Size before removing anything: " + s.size());

        System.out.println("Popped element: " + s.pop());

        System.out.println("Size after removing element: " + s.size());

        System.out.println("Top after removing element: " + s.top());

        System.out.println("Is stack empty? " + s.isEmpty());

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        // s.pop(); // throws error as stack is empty now
        System.out.println("Is stack empty? " + s.isEmpty());
    }
}
