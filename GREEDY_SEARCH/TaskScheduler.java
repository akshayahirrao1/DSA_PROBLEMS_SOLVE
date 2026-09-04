import java.util.*;
class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int freq : map.values()) {
            pq.offer(freq);
        }

        int time = 0;

        while (!pq.isEmpty()) {

            List<Integer> temp = new ArrayList<>();

            int cycle = 0;

            for (int i = 0; i <= n; i++) {

                if (!pq.isEmpty()) {
                    int freq = pq.poll();
                    freq--;
                    if (freq > 0) {
                        temp.add(freq);
                    }
                    cycle++;
                } 
                else {
                    if (temp.isEmpty()) {
                        break;
                    }
                    cycle++;
                }
            }
            for (int freq : temp) {
                pq.offer(freq);
            }
            time += cycle;
        }
        return time;
    }
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int result = scheduler.leastInterval(tasks, n);
        System.out.println("Least Interval: " + result);
    }
}