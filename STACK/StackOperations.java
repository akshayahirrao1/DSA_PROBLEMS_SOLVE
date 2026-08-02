import java.util.*;

class StackOperations {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public StackOperations() {

    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            minStack.push(Math.min(value, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        StackOperations stackOps = new StackOperations();
        stackOps.push(-2);
        stackOps.push(0);
        stackOps.push(-3);
        System.out.println(stackOps.getMin());
        stackOps.pop();
        System.out.println(stackOps.top());    
        System.out.println(stackOps.getMin()); 
}
}

