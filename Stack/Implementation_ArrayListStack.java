import java.util.ArrayList;

import javax.sound.midi.Sequencer.SyncMode;

public class Implementation_ArrayListStack<T> { //generic stack class
    
    private ArrayList<T> arr = new ArrayList<>(); // generic arraylist for stack implemenation

    // push function without need of resize logic
    public void push(T element) {
        arr.add(0, element);
    }
    
    //size using the built-in size() method of arraylist
    public int size() {
        return arr.size();
    }

    //isEmpty using the built-in isEmpty() method of arraylist
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    //pop using built-in remove() method of arraylist and exception handling on empty
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty!");
        }
        return arr.remove(size() - 1);
    }
    
    //pop using built-in get() method of arraylist and exception handling on empty
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty.");
        }
        return arr.get(size() - 1);
    }

    public static void main(String[] args) {
        Implementation_ArrayListStack<Integer> li = new Implementation_ArrayListStack<>(); //initialise stack without size, as it's dynamic
        li.push(1);
        li.push(2);
        // you can list n number of elements, the arraylist will automatically resize it when needed, you won't even know

        System.out.println("current size of stack: "+li.size()); // currently it have 2 elements
        System.out.println("top most element is: "+li.pop()); // pop the top most element LIFO 
        System.out.println("new size of stack is: " + li.size()); // 1
        System.out.println("is stack empty?: " + li.isEmpty()); // false
        System.out.println("top most element is: " + li.pop());
        System.out.println("is stack empty: " + li.isEmpty()); //true
        System.out.println("tying to get top most element when stack is empty: " + li.pop());//li.pop(); //exception 
    }
}