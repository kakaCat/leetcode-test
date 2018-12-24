package lifo;

import lifo.stack.MyStack;

public class Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());
        boolean push = stack.push(4);
        System.out.println(push);
        boolean pop = stack.pop();
        stack.push(4);

        System.out.println(stack.top());


    }

}
