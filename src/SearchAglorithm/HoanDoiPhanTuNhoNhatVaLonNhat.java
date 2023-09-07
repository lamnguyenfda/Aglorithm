package SearchAglorithm;

import java.util.Scanner;

public class HoanDoiPhanTuNhoNhatVaLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n =  sc.nextInt();
          int [] a = new int[n];
          for (int i = 0; i < n; i++) {
               a[i] = sc.nextInt();
          }
          int min =  SearchMin(a, n);
          int max  = SearchMax(a, n);

          int  temp = a[min];
           a[min] = a[max];
          a[max]  = temp;

          for (int i : a) {
            System.out.print(i + " ");
          }
    }
    public static int SearchMin(int []a ,int n){
      int min = 0 ;
      for (int i = 1; i < n; i++) {
         if (a[i] < a[min] ) {
             min = i; 
         }
      }
    return min;
    }
    public static int SearchMax(int []a ,int n){
        int max = 0;
        for (int i = n; i< n; i++) {
            if (a[i] >= a[max]) {
                max = i;
            }
        }
        return max;
        
    }
}
