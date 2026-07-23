
import java.util.*;

class KthFrequentUsingPriorityQueue {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4,};
        int k = 2;
        HashMap<Integer, Integer> freqmap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (int num : arr) {
            freqmap.put(num, freqmap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getKey());
        }

    }
}
