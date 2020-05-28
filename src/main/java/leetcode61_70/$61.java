package leetcode61_70;

import linked.base.ListNode;

/**
 * @ClassName $61
 * @Description 61. 旋转链表
 * @Author yunp
 * @Date 2020/5/22 11:05
 * @Version 1.0
 **/
public class $61 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2).add(new ListNode(4).add(new ListNode(3)));

        ListNode node = rotateRight(l1, 10);

        System.out.println();
    }


    public static ListNode rotateRight(ListNode head, int k) {

        // base cases
        if (head == null) return null;
        if (head.next == null) return head;

        // close the linked list into the ring
        ListNode old_tail = head;
        int n;
        for(n = 1; old_tail.next != null; n++){
            old_tail = old_tail.next;
        }
        old_tail.next = head;

        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node
        ListNode new_tail = head;



        for (int i = 0; i < n - k % n - 1; i++){
            System.out.println(n - k % n - 1);
            new_tail = new_tail.next;
        }

        ListNode new_head = new_tail.next;

        // break the ring
        new_tail.next = null;



        return new_head;

    }





}
