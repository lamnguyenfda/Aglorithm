package LinkedlistDataStruct;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class addElementIntoLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new LinkedList<>();
        int n  = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ls.add(x);
        }
        for (Integer in : ls) {
            System.out.print(in + " ");
        }
        
    }
}
