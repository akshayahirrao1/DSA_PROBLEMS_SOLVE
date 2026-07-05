
import java.util.*;

class TopKFrequentElements {

    public int[] TopKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqmap = new HashMap<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        int[] answer = new int[k];
        for (int num : nums) {
            freqmap.put(num, freqmap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(number);
        }
        int index = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] == null) {
                continue;
            }
            for (int num : bucket[i]) {
                answer[index] = num;
                index++;
                if (index == k) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TopKFrequentElements solution = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = solution.TopKFrequent(nums, k);
        System.out.println(Arrays.toString(result));

    }
}
