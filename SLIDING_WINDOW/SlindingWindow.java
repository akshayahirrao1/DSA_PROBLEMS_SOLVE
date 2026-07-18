
import java.util.*;
class SlindingWindow {

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -3, 5, -1, 7, 8};
        int k = 3;
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int idx = 0;
        for (int i = 0; i < k; i++) {

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            ans[idx++] = nums[dq.peekFirst()];
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        ans[idx++] = dq.peekFirst();
        System.out.println(Arrays.toString(ans));
    }
}
