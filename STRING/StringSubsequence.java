
class StringSubsequence {

    static boolean isSubsequence(String s, String t) {
        //the fucntion will still return true if this condition did not exist it is just for understanding the edge case
        if (s.length() == 0) {
            return true;
        }
        int j = 0;
        int i = 0;
        while (i < t.length() && j < s.length()) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                i++;
            } else {
                i++;
            }
        }
        return (j == s.length()); }

    public static void main(String[] args) {
        boolean result = isSubsequence("db","abcde");
        System.out.println(result);
    }
}
