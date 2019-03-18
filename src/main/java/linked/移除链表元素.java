package linked;

import linked.base.ListNode;

public class 移除链表元素 {
    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = null;
        ListNode current = head;
        while (current.next!=null){
            if(current.next.val == val){
                break;
            }
            temp = current.next;
        }
        removeNode(current);
        return head;
    }

    private static void removeNode(ListNode head){
        ListNode remove = head.next;
        head.next = remove.next.next;
        remove.next = null;

    }

    public ListNode removeElements2(ListNode head, int val) {
        if(head == null)
            return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

}
