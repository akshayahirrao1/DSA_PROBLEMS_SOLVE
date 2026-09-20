class MergeSortedLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                ans.next = temp1;
                ans = ans.next;
                temp1 = temp1.next;
            } else {
                ans.next = temp2;
                ans = ans.next;
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            ans.next = temp1;
            ans = ans.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            ans.next = temp2;
            ans = ans.next;
            temp2 = temp2.next;
        }
        return head.next;
    }
    public static void main(String[] args) {
        MergeSortedLinkedList obj = new MergeSortedLinkedList();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList = obj.mergeTwoLists(list1, list2);
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}