package AddTwoNumbers;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/22
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        StringBuffer S1 = new StringBuffer();
        StringBuffer S2 = new StringBuffer();
        while (l1.next!=null){

            S1.append(l1.next.val);

            S1.append(l2.next.val);
        }

        S1.reverse();
        S2.reverse();
        int I1 = Integer.valueOf(String.valueOf(S1));
        int I2 = Integer.valueOf(String.valueOf(S2));



        int I3 = I1 + I2;

        StringBuffer S3 = new StringBuffer();
        S3.append(I3);
        S3.reverse();

        for (int i = 0 ; i < S3.length(); i++){
            l3.next.val = S3.charAt(i);
        }
        return l3;
    }
}