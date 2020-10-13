package SwapPairs;

/**
 * @description:
 * @author: wwh
 * @create: 2020/10/13
 */
public class SwapPairs {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {

                if (head == null || head.next == null) {
                    return head;
                }
                ListNode newHead = head.next;
                head.next = swapPairs(newHead.next);
                newHead.next = head;
                return newHead;
                //head,test

        }
    }
 class ListNode {
    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}