package fifo.queue;

public class MyCircularQueue {

    private int[] data ;

    private volatile int head;

    private volatile int tail;

    private int size;


    public MyCircularQueue(int k) {

        data= new int[k];
        size = k;
        head = -1;
        tail = -1;
    }

    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    public int Front() {
        return isEmpty()? -1:data[head];
    }

    public int Rear() {
        return isEmpty() ? -1: data[tail];
    }
    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }


}
