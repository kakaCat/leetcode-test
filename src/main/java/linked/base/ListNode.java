package linked.base;

/**
 * Created by JAVA on 2018/5/25.
 */
public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public ListNode() {

    }
    public ListNode addVal(int val){
        ListNode node = new ListNode(val);
        ListNode current = this;

        while (current !=null){
            current = current.next;
        }
        current.next = node;
        return this;
    }



    public ListNode add(ListNode node){
        ListNode temp = null;
        while (this.next != null ){
            temp = this.next;
        }
        if(temp == null){
            this.next = node;
        }else {
            temp.next = node;
        }

        return this;
    }


}
