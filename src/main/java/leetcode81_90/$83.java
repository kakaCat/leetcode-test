package leetcode81_90;

import linked.base.ListNode;
import tree.base.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $83
 * @Description 83. 删除排序链表中的重复元素
 * @Author yunp
 * @Date 2020/4/27 11:14
 * @Version 1.0
 **/
public class $83 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1).add(new ListNode(2).add(new ListNode(2)));
        ListNode node1 = deleteDuplicates(node);

        System.out.println(node1);

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }



}
