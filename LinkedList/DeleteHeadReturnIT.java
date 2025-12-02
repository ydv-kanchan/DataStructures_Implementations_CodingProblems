package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteHeadReturnIT {
    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static int deleteHeadAndReturnIt(Node head) {
        Node temp = head;
        if (temp != null) {
            head = temp.next;
            return temp.data;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //5

        Node head = new Node(10); //first node is 10

        Node temp = head; //temp is 10, keep track of last element

        for (int i = 1; i < n; i++) {

            int num = sc.nextInt(); //random number input

            Node newNode = new Node(num); //make a new node of 

            temp.next = newNode; //connect newNode with last element;

            temp = newNode; //keep track of last element
        }

        //traversing a linkedlist 
        Node a = head;
        while (a != null) {
            System.out.print(a.data + " ");
            a = a.next;
        }
        System.out.println();
        System.out.println("deleted node is : " + deleteHeadAndReturnIt(head));
        sc.close();
    }
}
