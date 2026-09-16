import java.util.Collections;
import java.util.PriorityQueue;

class KthSallestIn2DArray {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int[] row : matrix) {
            for (int value : row) {
                pq.offer(value);
            }
            while (!pq.isEmpty() && pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        KthSallestIn2DArray obj = new KthSallestIn2DArray();
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        int result = obj.kthSmallest(matrix, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}