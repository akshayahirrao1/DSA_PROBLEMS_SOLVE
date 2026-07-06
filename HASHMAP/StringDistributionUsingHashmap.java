
import java.util.ArrayList;
import java.util.HashMap;

class StringDistributionUsingHashmap {

    public static void main(String[] args) {
        String[] words = {"apple", "ant", "banana", "bat", "ball", "cat", "car"};
        HashMap<Character, ArrayList<String>> map = new HashMap<>();
        for (String word : words) {
            char firstchar = word.charAt(0);
            if (!map.containsKey(firstchar)) {
                map.put(firstchar, new ArrayList<>());
            }
            map.get(firstchar).add(word);
        }
        System.out.println(map);
    }
}
