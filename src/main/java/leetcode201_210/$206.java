package leetcode201_210;

import linked.base.ListNode;

/**
 * @author admin
 * @date 2022/10/10
 * https://leetcode.cn/problems/reverse-linked-list/
 */
public class $206 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        reverse3(dummy,null);
        System.out.println("");
    }

    public static ListNode reverse3(ListNode prev , ListNode end){
        ListNode last = prev.next; //1
        ListNode cur = last.next;   //2
        while(cur!=end){
            last.next = cur.next; //1->3
            cur.next = prev.next; //2->1
            prev.next = cur; //0->2
            cur = last.next;
        }
        return last;
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
