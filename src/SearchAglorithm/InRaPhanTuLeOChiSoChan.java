package SearchAglorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.Checksum;

public class InRaPhanTuLeOChiSoChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Boolean check = true;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0 && i % 2 == 0) {
                System.out.println(a[i] + " ");
                 check = false;
            }
        }
        if (check ) {
            System.out.println("NULL");
        }
    }

}