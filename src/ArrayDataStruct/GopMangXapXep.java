package ArrayDataStruct;
import java.util.Scanner;

public class GopMangXapXep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N :");
        int n = sc.nextInt();
         System.out.println("Nhap m:");
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        System.out.println("Nhap mang 1:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap so " + i+1 + ":");
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap mang 2:");
        for (int i = 0; i < m; i++) {
             System.out.println("Nhap so " + i+1 + ":");
            b[i] = sc.nextInt();
        }
        int[] c = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }

        for (int d : c) {
            System.out.print(d + ", ");
        }

    }
}
