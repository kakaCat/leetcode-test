package linked;

import linked.base.ListNode;

public class 相交链表 {

    public static void main(String[] args) {
        ListNode temp = new ListNode(2).add(new ListNode(3).add(new ListNode(4)));
        ListNode l1 = new ListNode(0);
//        l1.add(new ListNode(1).add(temp) );
        l1.add(new ListNode(1));

        ListNode l2 = new ListNode(5);
//        l2.add(temp);


        ListNode intersectionNode = getIntersectionNode(l1, l2);
        System.out.println(intersectionNode.val);

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;

        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
