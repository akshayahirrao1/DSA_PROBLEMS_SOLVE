import java.util.*;
class CookieAssign {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] g = {1,2,3};
        int[] s = {1,1};
        CookieAssign obj = new CookieAssign();
        int result = obj.findContentChildren(s,g);
        System.out.println(result);
    }
}