package linked;

import linked.base.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JAVA on 2018/5/25.
 */
public class 反转链表 {

    public static void main(String[] args) {
        ListNode head = new ListNode();



        reverseList(head);

        System.out.println("---");


    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode top = null;
        ListNode current = head;

        while(current==null||current.next==null){
            ListNode temp = current.next;
            if(temp == null){
                top = current;
            }
            temp.next =pre;

            pre = current;
            current = temp;


        }


        return top;
    }


}
