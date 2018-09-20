package sort.utils;

/**
 * Created by JAVA on 2018/8/27.
 */
public class Swap {


    public static int[] initNums = { 6, 5, 3, 1, 8, 7, 2, 4 };

    public static void swap(int i, int j, int... nums){

        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }

}
