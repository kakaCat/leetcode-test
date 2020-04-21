package leetcode441_450;

import linked.base.ListNode;

/**
 * @ClassName $445
 * @Description 两数相加 II
 * @Author yunp
 * @Date 2020/4/14 17:53
 * @Version 1.0
 **/
public class $445 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        ListNode l12 = new ListNode(2);
        l1.add(l12);
        ListNode l13 = new ListNode(4);
        l12.add(l13);
        ListNode l14 = new ListNode(3);
        l13.add(l14);

        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l2.add(l22);
        ListNode l23 = new ListNode(4);
        l22.add(l23);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {



        while (true){
            if(l1.next != null||l2.next != null){
                addTwoNumbers(l1, l2);
            }
        }
    }
    public static int carry  = 0;
    public ListNode addTwoNumber(ListNode l1, ListNode l2){
        if(l2.next==null){
            int sum = l1.val + l2.val;
            if(sum>10){
                carry  = l2.val/10;
                sum = sum%10;
            }


//            2.val = sum;
        }
        return l2;
    }

}
