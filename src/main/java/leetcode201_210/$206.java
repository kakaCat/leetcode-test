package leetcode201_210;

import linked.base.ListNode;

/**
 * @author admin
 * @date 2022/10/10
 * https://leetcode.cn/problems/reverse-linked-list/
 */
public class $206 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1).add(new ListNode(2).add(new ListNode(3)));
        reverseList2(head);

    }
    public static ListNode reverseList(ListNode head) {
        if(head==null|| head.next==null){
            return head;
        }
        ListNode resverse = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return resverse;
    }

    public static ListNode reverseList2(ListNode head) {
        ListNode pre=null, curr=head;
        while (curr!=null){
            ListNode t = curr.next;
            curr.next = pre;
            pre = curr;
            curr = t;
        }
        return pre;
    }

    public static void swap(ListNode cur ,ListNode pre){
        ListNode t = cur.next;
        cur.next = pre;
        pre = cur;
        cur = t;
    }

}
