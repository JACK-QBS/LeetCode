package simple;


/**
 * 两个链表的第一个公共结点 （offer 52）
 */
public class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) {
        val = x;
        next = null;
    }
}
class Solution3 {
    public ListNode3 getIntersectionNode(ListNode3 headA, ListNode3 headB) {
        int countA = 0,countB = 0;
        ListNode3 curA = headA;
        ListNode3 curB = headB;

        ListNode3 pl = null;
        ListNode3 ps = null;

        //1、求链表长度
        while(curA != null) {
            countA ++;
            curA = curA.next;
        }
        while (curB != null) {
            countB ++;
            curB = curB.next;
        }

        //2、求最长的链表走的差步
        if (countA > countB) {
            int count = countA - countB;
            pl = headA;
            ps = headB;
            for (int i = 0;i < count; i++) {
                pl = pl.next;
            }
            while (pl != null) {
                if (pl == ps) {
                    return pl;
                }
                pl = pl.next;
                ps = ps.next;
            }
        } else {
            int count = countB - countA;
            pl = headB;
            ps = headA;
            for (int i = 0;i < count; i++) {
                pl = pl.next;
            }
            while (pl != null) {
                if (pl == ps) {
                    return pl;
                }
                pl = pl.next;
                ps = ps.next;
            }
        }
        return null;
    }
}

/**
 * 返回链表的入环结点
 */
/*
public class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) {
        val = x;
        next = null;
      }
  }

class Solution3 {
    public ListNode3 detectCycle(ListNode3 head) {
        ListNode3 fast = head;
        ListNode3 slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            //没有环
            return null;
        }
        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}*/
