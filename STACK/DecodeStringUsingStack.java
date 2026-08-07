import java.util.*;

class DecodeStringUsingStack {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> string = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                numbers.push(num);
                string.push(curr.toString());
                num = 0;
                curr = new StringBuilder();
            } else if (ch == ']') {
                int repeat = numbers.pop();
                String previous = string.pop();

                StringBuilder temp = new StringBuilder(previous);
                while (repeat > 0) {
                    temp.append(curr);
                    repeat--;
                }
                curr = temp;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
    public static void main(String[] args) {
        DecodeStringUsingStack decoder = new DecodeStringUsingStack();
        String input = "3[a2[c]]";
        String output = decoder.decodeString(input);
        System.out.println(output);
    }
}