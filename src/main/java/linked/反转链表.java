//package linked;
//
//import linked.base.ListNode;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by JAVA on 2018/5/25.
// */
//public class 反转链表 {
//
//    public static void main(String[] args) {
//        ListNode head = new ListNode();
//
//        for(int i=0;i<5;i++){
//           head.add(i,i+1);
//       }
//
//        reverseList(head);
//
//        System.out.println("---");
//
//
//    }
//
//    public static ListNode reverseList(ListNode head) {
//        List<Integer> stact = new ArrayList();
//
//        ListNode current = head;
//        while(head!=null){
//            stact.add(current.val);
//            current=head.next;
//        }
//        current = head;
//        int length = stact.size();
//        for(int i=0;i<length ;i++){
//            current.val= stact.get(i);
//            current=current.next;
//        }
//
//        return head;
//    }
//
//
//}
