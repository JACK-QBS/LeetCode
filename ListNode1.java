package simple;


/**
 * 删除链表中重复的结点
 */
public class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

class Solution1 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        ListNode cur = pHead;

        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while(cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;

            } else {
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
}



/**
 * 链表分割
 */
/*public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class Partition1 {
    public ListNode partition(ListNode pHead, int x) {
        ListNode bh = null;
        ListNode bl = null;

        ListNode ah = null;
        ListNode al = null;

        ListNode cur = pHead;

        while (cur != null) {
            if(cur.val < x) {

                if(bh == null) {
                    //第一次进行插入 （尾插）
                    bh = cur;
                    bl = cur;
                } else {
                    bl.next = cur;
                    bl = cur;
                }

            } else {
                if(ah == null) {
                    // 第一次进行插入 （尾插）
                    ah = cur;
                    al = cur;
                } else {
                    al.next = cur;
                    al = cur;
                }
            }
            cur = cur.next;
        }
        if(bh == null) {
            return ah;
        }
        bl.next = ah;
        if(ah != null) {
            al.next = null;
        }

        return bh;
    }
}*/



/**
 * 倒数第 k 个结点
 */
/*
public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
}
class Solution1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(k <= 0 || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("K值过大！");
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}*/
