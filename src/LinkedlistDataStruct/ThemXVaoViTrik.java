package LinkedlistDataStruct;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class  ThemXVaoViTrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new LinkedList<>();
        int n  = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            ls.add(c); 
        }
   
        int  k  = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (i == k) {
                ls.add(i, x);
            }
        }
        for (Integer integer : ls) {
            System.out.print(integer + " ");
        }

    }
}
