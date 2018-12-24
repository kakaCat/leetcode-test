package fifo;

import fifo.queue.MyCircularQueue;

public class Main {
    public static void main(String[] args) {
//        MyQueue q = new MyQueue();
        MyCircularQueue q  = new MyCircularQueue(3);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        boolean b = q.enQueue(4);
        System.out.println(b);
        int rear = q.Rear();
        System.out.println(rear);
        boolean full = q.isFull();
        System.out.println(full);
        boolean b1 = q.deQueue();
        System.out.println(b1);
        q.enQueue(4);
        int rear1 = q.Rear();
        System.out.println(rear1);

//        if (q.isEmpty() == false) {
//            System.out.println(q.Front());
//        }
//        q.deQueue();
//        if (q.isEmpty() == false) {
//            System.out.println(q.Front());
//        }
//        if (q.isEmpty() == false) {
//            System.out.println(q.Front());
//        }
//        q.deQueue();
//        if (q.isEmpty() == false) {
//            System.out.println(q.Front());
//        }



    }
}
