package offer;

import java.util.Deque;
import java.util.LinkedList;

public class A09用两个栈实现队列 {

    public static void main(String[] args) {
        CQueue q = new CQueue();
        q.appendTail(1);
        q.appendTail(2);
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());

    }



    public static class CQueue {

        private Deque<Integer> stack1;
        //删除栈
        private Deque<Integer> stack2;

        public CQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            //如果2是空 ，则把1 放到2中
            if(stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            //如果 2 为空 返回1
            if(stack2.isEmpty()){
                return -1;
            }
            //
            return stack2.pop();
        }
    }


}
