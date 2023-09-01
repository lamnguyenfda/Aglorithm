package StackAndQueueDataStruct;

import java.util.Scanner;
import java.util.Stack;

public class ChangeToBinary{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0) {      
            st.push(n%2);
             n/=2;
        }
         System.out.println("................................");
        while (!st.empty()) {
            System.out.print(st.peek());
            st.pop();
            }
        }
    }