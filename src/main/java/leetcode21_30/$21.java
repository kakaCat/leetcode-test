package leetcode21_30;

import linked.base.ListNode;

/**
 * @ClassName $21
 * @Description 合并两个有序链表
 * @Author yunp
 * @Date 2020/4/14 15:43
 * @Version 1.0
 **/
public class $21 {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        l1.add(l12);
        ListNode l13 = new ListNode(4);
        l12.add(l13);
        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        l2.add(l22);
        ListNode l23 = new ListNode(4);
        l22.add(l23);
        ListNode listNode = mergeTwoLists2(l1,l2);

        System.out.println("end");
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;

    }



}
