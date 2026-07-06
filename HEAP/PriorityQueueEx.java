
import java.util.Collections;
import java.util.PriorityQueue;

class PriorityQueueEx {

    public static void main(String[] args) {
        // By default PriorityQueue in Java is a min-heap, which means the smallest element is at the head of the queue.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);

        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        
        System.out.println("\n");
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.offer(10);
        maxheap.offer(20);
        maxheap.offer(30);
        maxheap.offer(40);
        maxheap.offer(50);

        System.out.println(maxheap.poll());
        System.out.println(maxheap.peek());
        System.out.println(maxheap.poll());
        System.out.println(maxheap.peek());

    }
}
