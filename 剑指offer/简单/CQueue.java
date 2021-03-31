import java.util.*;
class CQueue {
    Deque<Integer> A,B;

    public CQueue() {
        //存放第一次压栈进入的元素，用于队尾操作
        A = new LinkedList<>();
        //将 A 中的元素 压栈进入 B 中，用于队首操作
        B = new LinkedList<>();
    }

    //队尾插入整数
    public void appendTail(int value) {
        A.addLast(value);
    }

    //头部删除
    public int deleteHead() {
        if (!B.isEmpty()) {
            return B.removeLast();
        }
        if (A.isEmpty()) {
            // A 和 B中的元素已经全部被删完了
            return -1;
        }
        while (!A.isEmpty()) {
            //将 A 中的元素全部 压栈到 B 中
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */