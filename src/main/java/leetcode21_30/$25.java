package leetcode21_30;

public class $25 {
   static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        $25 solution = new $25();

        // 创建链表 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2; // 每2个节点一组翻转

        ListNode result = solution.reverseKGroup(head, k);

        // 打印翻转后的链表
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            if (count % k == 0) {
                prev = reverse(prev, curr.next);
                curr = prev.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
    private ListNode reverse(ListNode prev, ListNode next) {
        ListNode last = prev.next;
        ListNode curr = last.next;

        while (curr != next) {
            last.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = last.next;
        }

        return last;
    }
}
