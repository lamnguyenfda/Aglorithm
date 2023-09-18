package SortAglorithm;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a  = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       IntSertionSort(a,n);

        for (int i : a) {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int[] a,int n) {
         for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i -1; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                   a[j+1] = temp;
                }

            }
        }
    }
    public static void IntSertionSort(int [] a , int  n  ){
           for (int i = 1; i <n; i++) {
              int key  = a[i];
              int j = i-1;
              while (j >= 0 && a[j] > key ) {
                 a[j+1] = a[j];
                 j--;
              }  
              a[j+1] = key;           
         }
    }
}
