package SearchAglorithm;

import java.util.Scanner;

public class DemSoLuongXCoTrongDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n =  sc.nextInt();
          int [] a = new int[n];
          for (int i = 0; i < n; i++) {
               a[i] = sc.nextInt();
          }
          int x  = sc.nextInt();
          int sum = 0 ; 

          for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                sum ++;
            }
          }
          System.out.println(sum);
    }
}
