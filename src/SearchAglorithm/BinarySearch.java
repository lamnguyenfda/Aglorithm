package SearchAglorithm;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
         int  n = sc.nextInt();
         int []a = new int[n];
         for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }

    }
    public static int SearchBinary(int [] a , int n , int x ){
        int left = 0 ;int right = n-1;

        while (left <right) {
            int mid  = (left + right)/2;
            if (a[mid] > x) {
                right = mid;
            }else{
               left = mid +1; 
            }
            if(a[mid] == x) {
               
                right = mid - 1;
                 return mid;
            }
        }
        return -1;
    }
}
