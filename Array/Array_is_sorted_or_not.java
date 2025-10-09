package Array;

import java.util.Scanner;

public class Array_is_sorted_or_not {
    public static boolean isSorted(int[] arr, int n) {
        if (n < 2)
            return true;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr, n));
        sc.close();
    }
}
