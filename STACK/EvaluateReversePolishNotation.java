import java.util.*;
class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int right = stack.pop();
                int left = stack.pop();
                if (token.equals("+")) {
                    stack.push(left + right);
                } else if (token.equals("-")) {
                    stack.push(left - right);
                } else if (token.equals("*")) {
                    stack.push(left * right);
                } else {
                    stack.push(left / right);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
    public static void main(String[] args){
        EvaluateReversePolishNotation obj = new EvaluateReversePolishNotation();
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = obj.evalRPN(tokens);
        System.out.println(result);
    }
}