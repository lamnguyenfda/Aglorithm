 package LinkedlistDataStruct;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class XoaPhanTuLonHonPhanTuOViTriK {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
          int n = sc.nextInt();
          List<Integer> ls = new LinkedList<>();
          for (int i = 0; i < n; i++) {
             int x  = sc.nextInt();
             ls.add(x);
          }
          List<Integer> lsrm = new LinkedList<>();
          int k = sc.nextInt();
          for (int i = 0; i < n; i++) {
            if (ls.get(i) > ls.get(k)) {
                lsrm.add(ls.get(i));
            }
          }
          ls.removeAll(lsrm);

         for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
          }
    } 
}