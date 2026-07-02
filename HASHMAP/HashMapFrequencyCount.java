
import java.util.HashMap;

class HashMapFrequencyCount {

    public static void main(String[] args) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        String input = "Programming";
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for(char c :frequencyMap.keySet()){
            System.out.println(c+"->"+frequencyMap.get(c));
        }
    }
}
