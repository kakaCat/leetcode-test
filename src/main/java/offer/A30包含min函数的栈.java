package offer;

import linked.base.ListNode;
import tree.base.TreeNode;

import java.util.LinkedList;

public class A30包含min函数的栈 {




//    public static class MinStack {
//        // 存储栈
//        private LinkedList<Integer> stack;
//        // 最小值栈
//        private LinkedList<Integer> min;
//
//        /** initialize your data structure here. */
//        public MinStack() {
//            stack = new LinkedList<>();
//            min = new LinkedList<>();
//        }
//
//        public void push(int x) {
//            stack.push(x);
//            if(min.isEmpty()||min.peek()>x){
//                min.push(x);
//            }
//
//        }
//        public void pop() {
//            int v = stack.pop();
//            if( !min.isEmpty() && min.peek() == v){
//                min.pop();
//            }
//        }
//
//        public int top() {
//            return stack.isEmpty() ? null :stack.peek();
//        }
//
//        public int min() {
//            return min.peek();
//        }
//    }


}
