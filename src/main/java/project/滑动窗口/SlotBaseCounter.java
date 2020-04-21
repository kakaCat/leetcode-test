package project.滑动窗口;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName 滑动窗口
 * @Description TODO
 * @Author yunp
 * @Date 2020/1/13 20:21
 * @Version 1.0
 **/
public class SlotBaseCounter {


    private int slotSize;
    private AtomicInteger[] slotCounter;

    public SlotBaseCounter(int slotSize) {
        slotSize = slotSize < 1 ? 1 : slotSize;
        this.slotSize = slotSize;
        this.slotCounter = new AtomicInteger[slotSize];
        for (int i = 0; i < this.slotSize; i++) {
            slotCounter[i] = new AtomicInteger(0);
        }
    }

    public void increaseSlot(int slotSize) {
        slotCounter[slotSize].incrementAndGet();
    }

    public void wipeSlot(int slotSize) {
        slotCounter[slotSize].set(0);
    }

    public int totalCount() {
        return Arrays.stream(slotCounter).mapToInt(slotCounter -> slotCounter.get()).sum();
    }

    @Override
    public String toString() {
        return Arrays.toString(slotCounter);
    }

}
