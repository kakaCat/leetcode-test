package leetcode151_160;

import java.util.Deque;
import java.util.LinkedList;

public class $155 {

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.getMin();
        System.out.println("");
    }

    static class MinStack {
        Deque<Integer> xStack;
        Deque<Integer> minStack;

        public MinStack() {
            xStack = new LinkedList<Integer>();
            minStack = new LinkedList<Integer>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            xStack.push(x);
            minStack.push(Math.min(minStack.peek(), x));
        }

        public void pop() {
            xStack.pop();
            minStack.pop();
        }

        public int top() {
            return xStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }



}
