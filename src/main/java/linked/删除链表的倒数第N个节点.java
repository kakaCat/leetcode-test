package linked;

import linked.base.ListNode;

public class 删除链表的倒数第N个节点 {


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode temp = (new ListNode(2).add(new ListNode(3).add(new ListNode(4))));
        node.add(temp);
        ListNode listNode =  removeNthFromEnd(node, 1);

        System.out.println(listNode.val);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        ListNode sec = head;
        while((n--)!=0){
            if(pre.next == null) return sec.next;
            pre = pre.next;
        }
        while(pre.next!=null){
            pre = pre.next;
            sec = sec.next;
        }
        /** 倒数第N个节点 */
        ListNode temp=sec.next;
        sec.next = sec.next.next;
        temp.next = null;
        return head;
    }


}
