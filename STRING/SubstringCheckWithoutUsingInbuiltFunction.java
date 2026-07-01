
class SubstringCheckWithoutUsingInbuiltFunction {

    static boolean isSubstring(String str1, String str2) {
        int i = 0;
        if (str2.length() > str1.length()) {
            return false;
        }
        while (i <= str1.length() - str2.length()) {

            int j = 0;
            int index = i;
            while (j < str2.length() && str1.charAt(index) == str2.charAt(j)) {
                j++;
                index++;
            }

            if (j == str2.length()) {
                return true;
            }
            i++;
        }

        return false;
    }

    public static void main(String[] args) {

        String str1 = "ABABABC";
        String str2 = "ABAB";
        System.out.println(isSubstring(str1, str2));
    }
}
