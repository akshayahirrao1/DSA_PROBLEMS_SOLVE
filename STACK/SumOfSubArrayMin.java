import java.util.*;
class SumOfSubArrayMin {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - st.peek();
            }

            st.push(i);
        }

        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = st.peek() - i;
            }
            st.push(i);
        }
        long sum = 0;
        int MOD = 1_000_000_007;
        for (int i = 0; i < n; i++) {
            long contribution = (long) arr[i] * left[i] * right[i];
            sum = (sum + contribution) % MOD;
        }
        return (int) sum;
    }
    public static void main(String[] args) {
        SumOfSubArrayMin solution = new SumOfSubArrayMin();
        int[] arr = {3, 1, 2, 4};
        int result = solution.sumSubarrayMins(arr);
        System.out.println("Sum of Subarray Minimums: " + result); 
    }
}
