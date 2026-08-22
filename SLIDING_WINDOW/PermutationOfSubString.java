import java.util.*;
class PermutationOfSubString {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] s1count = new int[26];
        int k = s1.length();
        if(s1.length() > s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            s1count[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']++;
        }
    
        if (Arrays.equals(freq, s1count)) {
            return true;
        }
        for (int right = s1.length(); right < s2.length(); right++) {
            freq[s2.charAt(right) - 'a']++;
            freq[s2.charAt(right - k) - 'a']--;
            if (Arrays.equals(freq, s1count)) {
                return true;
            }
        }
        return false;
    }
     public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        PermutationOfSubString obj = new PermutationOfSubString();

        boolean result = obj.checkInclusion(s1, s2);

        System.out.println(result);
    }
}