package fifo.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    /** 队列 */
    private List<Integer> data;
    /** 开始指针 */
    private int p_start;

    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    /** 获取出队列 */
    public int Front() {
        return data.get(p_start);
    }
    
    /** 入列 */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }
    /** 出队列 */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }
    /** 是否为空 */
    public boolean isEmpty() {
        return p_start >= data.size();
    }

}

