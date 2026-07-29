import java.util.*;

class nextGreterElementCircular {
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * nums.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i % nums.length]) {
                st.pop();
            }
            if (i < nums.length) {
                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }

            st.push(nums[i % nums.length]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] arr1 = nextGreaterElements(arr);
        System.out.println(Arrays.toString(arr1));
    }
}