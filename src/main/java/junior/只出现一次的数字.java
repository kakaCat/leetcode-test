package junior;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by JAVA on 2018/5/24.
 */
public class 只出现一次的数字 {

    public static void main(String[] args) {
        int [] nums ={1,4,2,1,2};
        singleNumber2(nums);
    }

    public static int singleNumber2(int[] arr) {
        // invalid check
        if (arr.length == 0) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }


    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            if(!set.contains(num)){
                set.add(num);
            }else {
                set.remove(num);
            }
        }
        int num = 0;
        for (Integer integer : set) {
            num=integer;
        }

        return (int)num;
    }

}
