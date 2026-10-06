class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class ReverseLinkedListKtimes {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        int n = 1;
        while (current.next != null) {
            current = current.next;
            n++;
        }
        current.next = head;
        int h = k % n;
        current = head;
        int i = 0;
        while (i < n - h - 1) {
            current = current.next;
            i++;
        }
        ListNode newHead = current.next;
        current.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        ReverseLinkedListKtimes solution = new ReverseLinkedListKtimes();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        ListNode result = solution.rotateRight(head, k);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}