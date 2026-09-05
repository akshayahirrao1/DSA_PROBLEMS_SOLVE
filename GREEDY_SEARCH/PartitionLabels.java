import java.util.*;
class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> last = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int currentend = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            last.put(s.charAt(i), i);
        }
        for (int i = 0; i < s.length(); i++) {
            currentend = Math.max(currentend, last.get(s.charAt(i)));
            if (i == currentend) {
                ans.add(i - start + 1);
                start = i + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        PartitionLabels pl = new PartitionLabels();
        String s = "ababcbacadefegdehijhklij";
        List<Integer> result = pl.partitionLabels(s);
        System.out.println(result);
    }
}