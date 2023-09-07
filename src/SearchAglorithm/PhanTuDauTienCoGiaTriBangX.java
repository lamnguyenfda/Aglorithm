package SearchAglorithm;

import java.util.Scanner;

public class PhanTuDauTienCoGiaTriBangX {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n =  sc.nextInt();
          int [] a = new int[n];
          for (int i = 0; i < n; i++) {
               a[i] = sc.nextInt();
          }
          int x = sc.nextInt();
          int t = 0 ;
          for (int i = a.length; i >=0; i--) {
             if (a[i] == x) {
                 t = i ;
             }
          }
          if (t == 0 ) {
            System.out.println(-1);
          }else{
             System.out.println(t);
          }

    }
}
