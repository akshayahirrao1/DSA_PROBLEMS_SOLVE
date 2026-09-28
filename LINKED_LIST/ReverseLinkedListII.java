class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
            curr = curr.next;
        }
        for (int i = 0; i < right - left; i++) {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ReverseLinkedListII solution = new ReverseLinkedListII();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int left = 2;
        int right = 4;
        ListNode result = solution.reverseBetween(head, left, right);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}