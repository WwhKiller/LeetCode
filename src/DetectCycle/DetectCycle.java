package DetectCycle;

/**
 * @description:
 * @author: wwh
 * @create: 2020/10/10
 */
public class DetectCycle {


    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }
        //慢指针
        ListNode slowNode = head;

        //快指针
        ListNode fastNode = head.next;

        while (slowNode != fastNode){

            if (fastNode == null || fastNode.next ==null){
                return null;
            }

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

        }


        System.out.println(slowNode.val);return slowNode;
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
