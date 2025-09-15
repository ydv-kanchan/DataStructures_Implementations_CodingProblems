// understand the logic first

/*
Interview question: Implement stack using queue
 Approach 2: push costly, push is O(n), top is O(1), pop O(1)


 In real-world usage, pop() and top() are called far more often than push().
Example: In a function call stack, undo/redo system, or browser back button — you mostly pop/peek.

Therefore, the Push-Costly Approach is usually preferred in interviews because:

It makes pop and top efficient (O(1)).

Only push is costly, which happens less frequently compared to pop/top.

So yes, Push-Costly is considered the “better” approach in most scenarios.
But, interviewers love it when you say:

“If we expect more push operations, Pop-Costly might make sense; if more pop/top, Push-Costly is better. So the choice depends on the use case.”
 
 */

import java.util.LinkedList;
import java.util.Queue;

public class Implementation_StackDoubleQueue2 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return q1.remove();
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return q1.peek();
    }

    public int size() {
        return q1.size();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Implementation_StackDoubleQueue2 s = new Implementation_StackDoubleQueue2();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("size of stack: " + s.size());
        System.out.println("top element of stack is: " + s.top());
        System.out.println("popped element is: "+s.pop());
        System.out.println("popped element is: " + s.pop());
        System.out.println(s.size());
        s.pop();
        System.out.println("is stack empty? "+ s.isEmpty());
        s.pop();
        // s.pop();// exception as stack is empty
        System.out.println("is stack empty? "+ s.isEmpty());
    }

}