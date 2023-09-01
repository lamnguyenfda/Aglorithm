package ArrayDataStruct;
import java.util.Scanner;

public class CheckDayDonDieu {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhap N");
      int n = sc.nextInt();
      int []a = new int[10];

      for (int i = 0; i <= n ; i++) {
        a[i] = sc.nextInt();
      }
      Boolean tang = true;
      Boolean giam = true;

      for (int i = 1; i <= n; i++) {
        if (a[i] <= a[i - 1]) {
            giam = false;
        }
         if (a[i] >= a[i - 1]) {
            tang = false;

        }
      }
      if (tang||giam) {
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }


   } 
}
