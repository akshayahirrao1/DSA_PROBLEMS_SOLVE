import java.util.*;
class QueueInFirstOut {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public QueueInFirstOut() {

    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }

    public static void main(String[] args) {
        QueueInFirstOut queue = new QueueInFirstOut();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek()); 
        System.out.println(queue.pop());  
        System.out.println(queue.empty()); 
    }
}

