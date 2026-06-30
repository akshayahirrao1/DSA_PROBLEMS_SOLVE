
class StringFirstUniqueOcccurence {

    public static void main(String[] args) {
        String str = "Prpogramming";
        String str1 = str.toLowerCase();
        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (freq[str1.charAt(i) - 'a'] == 1) {
                System.out.println(str.charAt(i));
                return;
            }
        }
    }
}
