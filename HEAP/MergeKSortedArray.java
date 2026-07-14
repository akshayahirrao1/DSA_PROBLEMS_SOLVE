import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArray {

    public static void main(String[] args) {

        int[][] arrays = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        ArrayList<Integer> result = mergeKSortedArrays(arrays);

        System.out.println(result);
    }

    public static ArrayList<Integer> mergeKSortedArrays(int[][] arrays) {

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<Integer> result = new ArrayList<>();

        // Add first element of each array
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > 0) {
                pq.offer(new int[]{arrays[i][0], i, 0});
            }
        }

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int value = current[0];
            int arrayNum = current[1];
            int index = current[2];

            result.add(value);

            int nextIndex = index + 1;

            if (nextIndex < arrays[arrayNum].length) {
                pq.offer(new int[]{
                        arrays[arrayNum][nextIndex],
                        arrayNum,
                        nextIndex
                });
            }
        }

        return result;
    }
}