import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();

    public MedianFinder() {

    }

    public void addNum(int num) {
        left.add(num);
        right.add(left.poll());
        if (right.size() > left.size()) {
            left.add(right.poll());
        }
    }

    public double findMedian() {
        double value = (double) right.size() + left.size();
        if (value % 2 == 0) {
            double ans = (left.peek() + right.peek()) / 2.0;
            return ans;
        } else {
            double ans = left.peek();
            return ans;
        }
    }
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian()); 
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian()); 
    }
}
