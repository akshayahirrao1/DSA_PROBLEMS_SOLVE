import java.util.*;
class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        KthLargest obj = new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(obj.add(3)); 
        System.out.println(obj.add(1)); 
        System.out.println(obj.add(6)); 
        System.out.println(obj.add(10)); 
    }
}