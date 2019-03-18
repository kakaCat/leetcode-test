package linked;

import linked.base.ListNode;

public class 回文链表 {

    public static void main(String[] args) {
//        ListNode node = new ListNode(1).add(new ListNode(2).add(new ListNode(2).add(new ListNode(1))));
        ListNode node = new ListNode(1).add(new ListNode(2));
        boolean palindrome = isPalindrome(node);
        System.out.println(palindrome);
    }


    public static boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverseList(slow);
        while(slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }

        return true;
    }

    public static ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode reverse = null;
        ListNode pre = null;
        while(current!=null ){
            ListNode temp = current.next;
            if(temp == null){
                reverse = current;
            }
            current.next = pre;
            pre =current;
            current = temp;

        }
        return reverse;
    }

}
