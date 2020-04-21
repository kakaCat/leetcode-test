package project.滑动窗口;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Loops
 * @Description TODO
 * @Author yunp
 * @Date 2020/1/13 20:24
 * @Version 1.0
 **/
public class Loops {

    public static void dieLoop(Runnable runnable) {
        while (true) {
            run(runnable);
        }
    }

    public static void rateLoop(Runnable runnable, int mills) {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(mills);
            } catch (InterruptedException e) {

            }
            run(runnable);
        }
    }

    public static void fixLoop(Runnable runnable, int loop) {
        for (int i = 0; i < loop; i++) {
            run(runnable);
        }
    }

    private static void run(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
