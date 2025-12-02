import java.util.Scanner;

public class ArrayOperationsTimeComplexities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; //definition
        System.out.println("Array elements before  initialisation: ");
        for (int i = 0; i < n; i++) {
            System.out.println("element at: " + i + " " + arr[i]);
        }
        System.out.println();
        //initialisaion
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //iterate over array using for loop
        System.out.println();
        System.out.println("array elements after  initialisation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("array elements using while loop");
        //iterate over array using while loop
        int i = 0;
        while (i < n) {
            System.out.print( arr[i]+" ");
            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println("array elements using for:each loop");
        //iterate over  array using for:each loop
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("delete last element of the array, just simply ignore it");
        //delete element at the end of array
        for (int j = 0; j < n - 1; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("we can still access the last element using arr[index], but we just logically explude it from the array! "+arr[n-1]);
        
        System.out.println();
        System.out.println();
        System.out.println("delete element  in the middle");
        int[] arrNew = new int[n - 1];
        //suppose we want to delete element at index 1
        for (int K = 0; K < n - 1; K++) {
            if (K != 1) {
                arrNew[K] = arr[K];
                System.out.println("element at index: " + K + " " + arr[K]);
            } else {
                continue;
            }
        }
        System.out.println();
        System.out.println();
        
        //insert at the end and middle
        
        arr[n - 1] = 100;
        for (int a = 0; a < n; a++) {
            System.out.print(arrNew[a]+" ");
        }
        sc.close();
    }
}
