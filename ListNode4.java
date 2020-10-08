package simple;


/**
 * 合并两个有序单链表
 */
public class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4() {}
    ListNode4(int val) { this.val = val; }
    ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
}
class Solution4 {
    public ListNode4 mergeTwoLists(ListNode4 l1, ListNode4 l2) {
        ListNode4 newHead = new ListNode4(-1);
        ListNode4 tmp = newHead;
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                tmp.next = l1;
                tmp = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                tmp = l2;
                l2 = l2.next;
            }
        }
        if(l1 == null) {
            tmp.next = l2;
        }
        if(l2 == null) {
            tmp.next = l1;
        }
        return newHead.next;
    }
}