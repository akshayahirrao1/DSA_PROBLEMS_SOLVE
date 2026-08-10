import java.util.*;
class LargestRectangleAreaInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxarea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int currentheight = (i == heights.length) ? 0 : heights[i];
            while (!st.isEmpty() && heights[st.peek()] > currentheight) {
                int index = st.pop();
                int width;

                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }
                maxarea = Math.max(maxarea, heights[index] * width);
            }
            if (i < heights.length) {
                st.push(i);
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        LargestRectangleAreaInHistogram obj = new LargestRectangleAreaInHistogram();
        int [] heights = {2, 1, 5, 6, 2, 3};
        int result = obj.largestRectangleArea(heights);
        System.out.println("The largest rectangle area in the histogram is: " + result);
    }
}