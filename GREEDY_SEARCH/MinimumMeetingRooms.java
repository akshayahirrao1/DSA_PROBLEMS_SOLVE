import java.util.*;
class MinimumMeetingRooms {
    public int minMeetingRooms(int[][] intervals) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int[] interval : intervals) {
            if(!minHeap.isEmpty() && minHeap.peek() <= interval[0]) {
                minHeap.poll();
            }
            minHeap.offer(interval[1]);
        }
        return minHeap.size();
        
    }
    public static void main(String[] args) {
        MinimumMeetingRooms solution = new MinimumMeetingRooms();
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int result = solution.minMeetingRooms(intervals);
        System.out.println("Minimum number of meeting rooms required: " + result);
    }
}