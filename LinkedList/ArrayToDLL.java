package LinkedList;
import java.util.Scanner;

public class ArrayToDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public static Node arraytoDLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }
        return head;
    }

    // public static void printLL(Node head) {
    //     Node temp = head;
    //     while (temp != null) {
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    // }
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println("Current: " + temp.data);
            System.out.println("Prev: " + (temp.prev != null ? temp.prev.data : "null"));
            System.out.println("Next: " + (temp.next != null ? temp.next.data : "null"));
            System.out.println("-------------------");
            temp = temp.next;
        }
    }
    
    public static Node deleteHeadDLL(Node head) {
        if (head == null || head.next == null)
            return null;
        head = head.next;
        head.prev = null;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        Node head = arraytoDLL(arr2);
        printLL(head);
        head = deleteHeadDLL(head);
        printLL(head);
        sc.close();
    }
}
