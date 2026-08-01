import java.util.*;
class AstroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            boolean alive = true;

            while (alive && !stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0) {
                int currentSize = Math.abs(asteroids[i]);
                if (stack.peek() > currentSize) {
                    alive = false;
                } else if (stack.peek() < currentSize) {
                    stack.pop();
                    alive = true;
                } else {
                    stack.pop();
                    alive = false;
                }
            }
            if (alive) {
                stack.push(asteroids[i]);
            }
        }
        int[] arr = new int[stack.size()];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }

        return arr;
    }
 
 public static void main(String[] args) {
        AstroidCollision collision = new AstroidCollision();
        int[] asteroids = {5, 10, -5};
        int[] result = collision.asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));

}

}