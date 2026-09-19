class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode head = rll.new ListNode(1);
        head.next = rll.new ListNode(2);
        head.next.next = rll.new ListNode(3);
        head.next.next.next = rll.new ListNode(4);
        head.next.next.next.next = rll.new ListNode(5);

        ListNode reversedHead = rll.reverseList(head);
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}