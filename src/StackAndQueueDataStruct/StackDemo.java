package StackAndQueueDataStruct;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        String t = "Codelearn";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            st.push(t.charAt(i));
        }
        while (!st.empty()) {
        System.out.print(st.peek());
        st.pop();
        }
    }
}
