package leetcode151_160;

import linked.base.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class $160 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<Integer,ListNode> map = new HashMap();
        ListNode cur = headA;
        while(cur!=null){
            map.put(cur.val,cur);
            cur=cur.next;
        }

        while(headB!=null){
            if(Objects.nonNull(map.get(headB.val))){
                return map.get(headB.val);
            }
            headB = headB.next;
        }
        return null;
    }

}
