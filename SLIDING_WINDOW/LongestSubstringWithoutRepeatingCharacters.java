
import java.util.*;

class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        int maxlength = 0;
        int left = 0;
        String s = "abcabces";
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                char leftchar = s.charAt(left);
                set.remove(leftchar);
                left++;
            }
            set.add(ch);
            maxlength = Math.max(maxlength, right - left + 1);
        }
        System.out.println(maxlength);

    }
}
