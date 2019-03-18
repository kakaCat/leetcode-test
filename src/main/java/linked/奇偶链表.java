package linked;

import linked.base.ListNode;

public class 奇偶链表 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1).add(new ListNode(2).add(new ListNode(3).add(new ListNode(4))));
        ListNode listNode = oddEvenList(head);
        System.out.println(listNode);
    }



    public static ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        /** 临时 odd节点 */
        ListNode odd = head;
        /** head是odd链  */
        /** temp是even链 */
        ListNode temp = head.next;
        /** 临时 even节点 */
        ListNode even = temp;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        /** 最后odd节点指向even链 */
        odd.next = temp;
        return head;

    }

//    public static ListNode oddEvenList2(ListNode head) {
//        ListNode current = head;
//        ListNode node = null;
//        ListNode pro = null;
//
//        while(current!=null){
//            pro = current.next;
//            pro.next =
//
//
//        }
//
//
//
//    }

}
