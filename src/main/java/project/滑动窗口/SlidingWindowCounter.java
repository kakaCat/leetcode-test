package project.滑动窗口;

/**
 * @ClassName SlidingWindowCounter
 * @Description TODO
 * @Author yunp
 * @Date 2020/1/13 20:23
 * @Version 1.0
 * 滑动窗口计数有很多使用场景，比如说限流防止系统雪崩。相比计数实现，滑动窗口实现会更加平滑，能自动消除毛刺。
 **/
public class SlidingWindowCounter {

    private volatile SlotBaseCounter slotBaseCounter;
    private volatile int windowSize;
    private volatile int head;

    public SlidingWindowCounter(int windowSize) {
        resizeWindow(windowSize);
    }

    public synchronized void resizeWindow(int windowSize) {
        this.windowSize = windowSize;
        this.slotBaseCounter = new SlotBaseCounter(windowSize);
        this.head = 0;
    }

    public void increase() {
        slotBaseCounter.increaseSlot(head);
    }

    public int totalAndAdvance() {
        int total = totalCount();
        advance();
        return total;
    }

    public void advance() {
        int tail = (head + 1) % windowSize;
        slotBaseCounter.wipeSlot(tail);
        head = tail;
    }

    public int totalCount() {
        return slotBaseCounter.totalCount();
    }

    @Override
    public String toString() {
        return "total = " + totalCount() + " head = " + head + " >> " + slotBaseCounter;
    }

}
