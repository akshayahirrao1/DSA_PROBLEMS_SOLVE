import java.util.*;
class MergeIntevals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (end < intervals[i][0]) {
                ans.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
            end = Math.max(end, intervals[i][1]);
        }
        ans.add(new int[] { start, end });
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        MergeIntevals obj = new MergeIntevals();
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] mergedIntervals = obj.merge(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}