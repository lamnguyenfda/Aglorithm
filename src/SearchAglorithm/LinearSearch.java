package SearchAglorithm;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
      int x = sc.nextInt();
      System.out.println(search(a, x, n));
    }
    static int search(int []arr, int x , int length ){
           for (int i = 0; i < length ; i++) {
            if (arr[i] == x) {
                return i;
            }
           }
        return -1;
    }
}


