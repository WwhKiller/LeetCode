package HasCycle;

import AddTwoNumbers.ListNode;
import Sort.BubbleSort.BubbleSort;

/**
 * @description: 141. 环形链表
 * @author: wwh
 * @create: 2020/10/9
 */
public class HasCycle {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }
        //慢指针


        ListNode slowNode = head;

        //快指针
        ListNode fastNode = head.next;
        while (slowNode != fastNode){

            if (fastNode == null || fastNode.next ==null){
                return false;
            }

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

        }return true;
    }

    class ListNode{
        int val ;
        ListNode next;
        ListNode(int x){
            this.val = x;
            this.next = null;
        }
    }
}
