
import java.util.*;

class Remove_K_Digits {

    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : stack) {
            ans.append(ch);
        }
        while (!ans.isEmpty() && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        if (ans.isEmpty()) {
            return "0";
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Remove_K_Digits obj = new Remove_K_Digits();
        String s = "1432219";
        int k = 3;
        System.out.println(obj.removeKdigits(s, k));
    }
}
