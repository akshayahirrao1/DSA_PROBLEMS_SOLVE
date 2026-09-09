import java.util.*;
class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
             ans.add(intervals[i]);
             i++;
        }
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        ans.add(newInterval);
        while(i < intervals.length){
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        InsertInterval obj = new InsertInterval();
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = obj.insert(intervals, newInterval);
        for(int[] interval : result){
            System.out.println(Arrays.toString(interval));
        }
    }
}