import java.util.Scanner;

public class StarPatterns {
    /*
     
    n=5
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *

     */
    static void pattern1(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print(j==0 ? "*" : " *");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    /*
    
    N=5
    *
    * *
    * * * 
    * * * *
    * * * * *
    
     */
    static void pattern2(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j <= i) {
                System.out.print(j == i ? "*" : "* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
    /*
    
    N=5
    * * * * *
    * * * *
    * * *
    * *
    *
    
     */

    static void pattern3(int n) {
        int i = 0;
        while (i < n) {
            int j = n;
            while (j > i) {
                System.out.print(j == n ? "*" : " *");
                j--;
            }
            i++;
            System.out.println();
        }
    }
    /*
        
    N=5
    * * * * * *
      * * * * *
        * * * *
          * * *
            * *
              *
                  
    */
    static void pattern4(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < i) {
                System.out.print("  ");
                j++;
            }
            while (j < n) {
                System.out.print(j != i ? " *" : "*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
    /*
    
    N=5
             *
           * *
         * * *
       * * * *
     * * * * *
      
     */
    static void pattern5(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n - i - 1) {
                System.out.print("  ");
                j++;
            }
            while (j < n) {
                System.out.print(j == n - i - 1 ? "*" : " *");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    /*

    N=5    
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
        
    */

    static void pattern6(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            int k = 0;
            while (j < n - i - 1) {
                System.out.print("  ");
                j++;
            }
            while (j < n) {
                System.out.print("* ");
                j++;
            }
            while (k < i) {
                System.out.print(k == i - 1 ? "*" : "* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    
    /*
    
    N=5
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
     */

    static void pattern7(int n) {
        int i = 0;
        while (i < n) {
            int j = 0, k = 0;
            while (j < i) {
                System.out.print("  ");
                j++;
            }
            while (j < n) {
                System.out.print("* ");
                j++;
            }
            while (k < n - i - 1) {
                System.out.print(k == n - i ? "*" : "* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
    
    /*
    
    N=5
    
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
    
     */
    
    static void pattern8(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j <= i) {
                System.out.print(j == i ? "*" : "* ");
                j++;
            }
            System.out.println();
            i++;
        }
        while (i < n * 2 - 1) {
            int j = 0;
            while (j < n * 2 - i - 1) {
                System.out.print(j == i - 1 ? "*" : "* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    /*
    
    full diamond - rhombus
    N=5
            *
          *   *
        *   *   *
      *   *   *   *
    *   *   *   *   *
    *   *   *   *   *
      *   *   *   *
        *   *   *
          *   *
            *

     */
    static void pattern9(int n) {
        /*
        -> divde pattern into two halves - 
           1. top (i = 0 to i = n-1) decreasing space, increasing stars
           2. bottom (i = n to i = 2n) increasing space, decreasing stars
        -> each row have - 
           1. some spaces before star starts basically spaces till j = n-i-1 in top half
           2. some spaces before star starts basically spaces till k < 2n-i-1
        
        */
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // pattern1(n);
        // System.out.println();
        // pattern2(n);
        // System.out.println();
        // pattern3(n);
        // System.out.println();
        // pattern4(n);
        // System.out.println();
        // pattern5(n);
        // System.out.println();
        // pattern6(n);
        // System.out.println();
        // pattern7(n);
        // System.out.println();
        // pattern8(n);
        // System.out.println();
        pattern9(n);
        sc.close();
    }
}
