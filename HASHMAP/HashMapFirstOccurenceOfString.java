
import java.util.*;

class HashMapFirstOccurenceOfString {

    public static void main(String[] args) {
        boolean found = false;
        String str = "abcd";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (map.get(c) > 1) {
                System.out.println(c + "->" + map.get(c));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No character found with frequency greater than 1");
        }
    }
}
