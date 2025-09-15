package Array;

public class Basics {
    static int[] arr = new int[5];

    /* in case of java, if u define array globally of locally, it will be initialised 0 by default */
    public static void main(String[] args) {
        // int[] arr = new int[5];
        System.out.println("Before initialising, array elements are: "); // all elements will be 0 in java
        for   (int i = 0 ; i < 5 ; i++)   {
            System.out.println("element at "+ i + " is: " + arr[i] + " ");
        }
        System.out.println();
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("After initialising, array elements are: ");
        for   (int i = 0 ; i < 5 ; i++)   {
            System.out.println("element at "+ i + " is: " + arr[i]);
        }
        System.out.println();
    }
}