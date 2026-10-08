class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);

        ListNode less = lessDummy;
        ListNode greater = greaterDummy;
        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                less.next = current;
                less = less.next;
            } else {
                greater.next = current;
                greater = greater.next;
            }
            current = current.next;
        }
        greater.next = null;
        less.next = greaterDummy.next;
        return lessDummy.next;
    }
    public static void main(String[] args) {
        PartitionList partitionList = new PartitionList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        int x = 3;
        ListNode result = partitionList.partition(head, x);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}