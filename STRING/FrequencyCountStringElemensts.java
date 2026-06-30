
class FrequencyCountStringElemensts {

    public static void main(String[] args) {

        String str = "Programming";
        boolean[] visited = new boolean[str.length()];
        int maxcount = 1;
        char maxch = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                maxch = str.charAt(i);
            }

        }
        System.out.println("the maxcount of char " + maxch + " is " + maxcount);

    }
}
