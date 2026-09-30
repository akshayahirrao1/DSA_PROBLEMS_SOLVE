import java.util.HashMap;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class CopyListWithRandomPointers {
    public Node copyRandomList(Node head) {
        Node current = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (current != null) {
            Node copy = new Node(current.val);
            map.put(current, copy);
            current = current.next;
        }
        current = head;
        while (current != null) {
            Node copy = map.get(current);
            copy.next = map.get(current.next);
            copy.random = map.get(current.random);
            current = current.next;
        }
        return map.get(head);
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        node1.random = node2;
        node2.random = node2;

        CopyListWithRandomPointers solution = new CopyListWithRandomPointers();
        Node copiedList = solution.copyRandomList(node1);
        Node current = copiedList;
        while (current != null) {
            System.out.println("Node value: " + current.val);
            if (current.random != null) {
                System.out.println("Random points to: " + current.random.val);
            } else {
                System.out.println("Random points to: null");
            }
            current = current.next;
        }
        
    }
}