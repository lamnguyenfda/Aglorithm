package LinkedlistDataStruct;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ThayGiatriXBangGiaTrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            ls.add(c);
        }
        int x = sc.nextInt();
        int k = sc.nextInt();
       for (int i = 0; i < n; i++) {
         if (ls.get(i) == x) {
                ls.set(ls.get(i), k);
                }
        }
       
        for (Integer integer : ls) {
            System.out.print(integer + " ");
        }
    }
}
