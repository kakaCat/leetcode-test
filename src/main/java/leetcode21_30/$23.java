package leetcode21_30;


import linked.base.ListNode;

/**
 * @ClassName $23
 * @Description 23.  合并K个升序链表
 * @Author yunp
 * @Date
 * @Version 1.0
 **/
public class $23 {

    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        return treeMerge(lists,0,lists.length);
    }

    public ListNode treeMerge(ListNode[] lists,int l,int r){
        if (l == r) {
            return lists[l];
        }
        if(l>r){
            return null;
        }
        int mid = (l+r)>>2;

        return mergeTwo(treeMerge(lists,l,mid),treeMerge(lists,mid,r));
    }




    public ListNode mergeTwo(ListNode pro, ListNode after ){

        if(pro==null||after==null){
            return pro == null? after: pro;
        }
        ListNode head = new ListNode(0);
        ListNode l = pro;
        ListNode r = after;
        ListNode tail = head;
        while(l!=null&&r!=null){
            if(l.val<r.val){
                tail.next = l;
                l = l.next;
            }else{
                tail.next = r;
                r = r.next;
            }
            tail = tail.next;
        }
        tail.next = (l==null?r:l);

        return head.next;
    }
}
