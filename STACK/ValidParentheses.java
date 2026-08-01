import java.util.*;
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (stack.peek() == '(' && ch == ')' || stack.peek() == '[' && ch == ']'
                            || stack.peek() == '{' && ch == '}') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "({[]})";
        boolean result = validParentheses.isValid(s);
        System.out.println(result);
    }
}