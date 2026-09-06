import java.util.*;
class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        List<int[]> ans = new ArrayList<>();
        for (int[] person : people) {
            ans.add(person[1], new int[] { person[0], person[1] });
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        QueueReconstructionByHeight solution = new QueueReconstructionByHeight();
        int[][] people = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
        int[][] result = solution.reconstructQueue(people);
        for (int[] person : result) {
            System.out.println(Arrays.toString(person));
        }
    }
}