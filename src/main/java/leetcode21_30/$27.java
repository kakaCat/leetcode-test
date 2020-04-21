package leetcode21_30;

import java.util.List;

/**
 * @ClassName $27
 * @Description 移除元素
 * @Author yunp
 * @Date 2020/4/14 16:46
 * @Version 1.0
 **/
public class $27 {


    public static void main(String[] args) {
       int[] nums = new int[] {3,2,2,3};
       int val = 3;
        int i = removeElement(nums, 3);
        System.out.println("end");
    }


    public static int removeElement(int[] nums, int val) {
     
        int i = 0;
        for (int j = 0 ,len = nums.length; j < len; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

}
