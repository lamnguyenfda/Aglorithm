package LinkedlistDataStruct;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InMang1DenNtru1Va0DenKTru1 {
public static void main(String[] args) {
    

    Scanner scanner = new Scanner(System.in);
    // Nhập số nguyên dương n
    int n = scanner.nextInt();
    List<Integer> linkedList = new LinkedList<>();
    // Nhập n số nguyên vào danh sách liên kết
    for(
    int i = 0;i<n;i++)
    {
        int num = scanner.nextInt();
        linkedList.add(num);
    }
    // Nhập số nguyên k
    int k = scanner.nextInt();
    // In ra các phần tử từ k đến n-1
    for(
    int i = k;i<n;i++)
    {
        System.out.print(linkedList.get(i) + " ");
    }
    // In ra các phần tử từ 0 đến k-1
    for(int i = 0;i<k;i++){
        System.out.print(linkedList.get(i) + " ");
    }
}
}