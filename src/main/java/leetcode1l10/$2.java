package leetcode1l10;

import linked.base.ListNode;

import java.util.LinkedHashMap;

public class $2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2).add(new ListNode(4).add(new ListNode(3)));
        ListNode l2 = new ListNode(5).add(new ListNode(6).add(new ListNode(4)));

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println("--");

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }

    public static ListNode add(ListNode l1, ListNode l2,int carry){
        if(l1==null&&l2==null&&carry==0){
            return null;
        }
        int val1 = 0,val2=0;
        ListNode next1 = null,next2=null;
        if(l1 !=null){
            val1 = l1.val;
            next1 = l1.next;
        }
        if(l2 !=null){
            val2 = l2.val;
            next2 = l2.next;
        }
        int sum = val1 + val2 + carry;
        ListNode l3 = new ListNode(sum % 10);
        l3.next = add(next1, next2, sum / 10);
        return l3;

    }



}
