package linked;

import linked.base.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JAVA on 2018/5/25.
 */
public class 反转链表 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1).add(new ListNode(2).add(new ListNode(3)));

        reverseList(head);

        System.out.println("---");


    }

    public static ListNode reverseList(ListNode node) {
        ListNode pre = null;
        ListNode head = null;
        ListNode current = node;

        while(current!=null){
            ListNode temp = current.next;
            if(temp == null){
                head = current;
            }

            current.next =pre;
            pre = current;

            /** nextnode */
            current = temp;


        }


        return current;
    }


}
