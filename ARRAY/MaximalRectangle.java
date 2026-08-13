import java.util.*;

class MaximalRectangle {
    public static int maxarea(int[] heights) {
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

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int[] heights = new int[matrix[0].length];
        int maxarea = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            maxarea = Math.max(maxarea(heights), maxarea);
        }
        return maxarea;
    }

    public static void main(String[] args) {

    char[][] matrix = {
        {'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'}
    };

    MaximalRectangle obj = new MaximalRectangle();

    int result = obj.maximalRectangle(matrix);

    System.out.println("Maximum Rectangle Area: " + result);
         }
    }

