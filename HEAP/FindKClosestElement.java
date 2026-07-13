import java.util.*;
class FindKClosestElement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return b[1] - a[1];
            }
            return b[0] - a[0];
        });
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : arr) {
            int distance = Math.abs(num - x);
            pq.offer(new int[] { num, distance });
            if (pq.size() > k) {
                pq.poll();
            }
        }
        for (int i = 1; i <= k; i++) {
            int[] pair = pq.poll();
            ans.add(pair[0]);
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        //code to access method
    }
}