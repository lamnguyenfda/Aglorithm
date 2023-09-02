package LinkedlistDataStruct;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class XuatPhanTuGiaTriK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            ls.add(c);
        }
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == k) {
                System.out.println(ls.get(i));
            }
        }
       
    }

}
