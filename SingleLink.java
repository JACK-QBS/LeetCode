package simple;


/**
 * 链表的中间节点(876)
 */
public class SingleLink {
       int val;
       SingleLink next;
       SingleLink(int x) { val = x; }
   }

class Solution {
    public SingleLink middleNode(SingleLink head) {
        SingleLink fast = head;
        SingleLink slow = head;
        while((fast != null) && (fast.next != null)) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}



/**
 * 反转链表(206)
 */
/*  public class SingleLink {
     int val;
     SingleLink next;
     SingleLink(int x) { val = x; }
  }
class Solution {
    public SingleLink reverseList(SingleLink head) {
        SingleLink newHead = null;
        SingleLink prev = null;
        SingleLink cur = head;

        while(cur != null) {
            SingleLink curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
                cur.next = prev;
                prev = cur;
                cur = curNext;
        }
        return newHead;
    }
}*/





/**
 * 移除链表元素
 */
/*class Solution {
    public SingleLink removeElements(SingleLink head, int val) {
        if(head == null) return null;
        SingleLink prev = head;
        SingleLink cul = head.next;
        while(cul != null) {
            if (cul.val == val) {
                prev.next = cul.next;
                cul = cul.next;
            } else {
                prev = cul;
                cul = cul.next;
            }
        }
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }
}
public class SingleLink {
    int val;
    SingleLink next;
    SingleLink(int x) { val = x; }
}*/
