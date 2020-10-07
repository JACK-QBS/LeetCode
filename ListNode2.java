package simple;


/**
 * 判断 链表是否有环
 */

public class ListNode2 {

    int val;
    ListNode2 next;
    ListNode2(int x) {
        val = x;
        next = null;
       }
  }
class Solution2 {
    public boolean hasCycle(ListNode2 head) {
        ListNode2 fast = head;
        ListNode2 slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}



/**
 * 回文链表
 */
/*public class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}
class Solution2 {
    public boolean isPalindrome(ListNode2 head) {
        if(head == null) {
            return true;
        }
        if(head.next == null) {
            return true;
        }
        //1、找出中间结点
        ListNode2 fast = head;
        ListNode2 slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //2、反转
        ListNode2 cur = slow.next;
        ListNode2 newHead = null;
        while(cur != null) {
            ListNode2 curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }

        //3、判断 val 是否相等 ， 一个从前往后走 ， 一个从后往前走
        while(head != slow) {
            if(head.val != slow.val) {
                return false;
            }
            //为了偶数结点来实现的
            if(head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}*/
