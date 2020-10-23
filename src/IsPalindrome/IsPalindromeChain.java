package IsPalindrome;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 * @description: 请判断一个链表是否为回文链表。
 * @author: wwh
 * @create: 2020/10/23
 */
public class IsPalindromeChain {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(0);
        listNode1.next=listNode2;

        System.out.println(isPalindrome(listNode1));

    }


    public static boolean isPalindrome(ListNode head) {

        if (head==null){
            return true;
        }

        List<ListNode> list = new ArrayList<>();

       do{
            list.add(head);
            head = head.next;
        } while (head != null);
        for (int i = 0,j = list.size()-1; i <=j ;i++,j--){
                if (list.get(i).val != list.get(j).val){
                    return false;
                }
        }
        return true;

    }

}
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

}