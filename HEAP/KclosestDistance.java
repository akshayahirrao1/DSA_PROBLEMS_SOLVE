
import java.util.*;

class KclosestDistance {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[2], a[2]));
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int dis = x * x + y * y;
            pq.offer(new int[]{x, y, dis});
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] point = pq.poll();
            ans[i][0] = point[0];
            ans[i][1] = point[1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = {{-2, 2}, {1, 3}, {4, 4}};
        int k = 2;
        KclosestDistance obj = new KclosestDistance();
        int[][] result = obj.kClosest(points, k);
        System.out.println(Arrays.deepToString(result));

    }
}
