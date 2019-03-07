package junior;

import java.util.List;

/**
 * Created by JAVA on 2018/5/28.
 */
public class 加一 {

    public static void main(String[] args) {
        int [] nums = {1,2,9};
        plusOne(nums);


    }
    public static int[] plusOne(int[] digits) {


        int n = digits.length;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;

    }


}
