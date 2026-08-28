class RemoveStarsWithPreviousValue {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() != 0 && s.charAt(i) == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "leet**cod*e";
        RemoveStarsWithPreviousValue obj = new RemoveStarsWithPreviousValue();
        String ans = obj.removeStars(s);
        System.out.println(ans);
    }
}