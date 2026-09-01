import java.util.Arrays;
class IntervalGreedyProblem {
    public static int maxActivities(int[] start, int[] end){
       int[][] activities = new int[start.length][2];
       for(int i = 0; i < start.length; i++){
              activities[i][0] = start[i];
              activities[i][1] = end[i];
       } 
       Arrays.sort(activities, (a,b) -> Integer.compare(a[1], b[1]));
       int count = 1;
       int lastend = activities[0][1];
       for(int i = 1; i < activities.length; i++) {
        if(activities[i][0] >= lastend) {
            count++;
            lastend = activities[i][1];
        }
       }
       return count;
    }
    public static void main(String[] args){
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};
        IntervalGreedyProblem obj = new IntervalGreedyProblem();
        int maxActivities = obj.maxActivities(start, end);
        System.out.println(maxActivities);
        
    }
}