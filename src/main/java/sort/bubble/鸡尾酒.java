package sort.bubble;

import sort.utils.Swap;

/**
 * Created by JAVA on 2018/8/27.
 */
public class 鸡尾酒 {

    public static void main(String[] args) {
        int[] nums = Swap.initNums;
        CocktailSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }

    private static void CocktailSort(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while (left < right) {

            for (int i = left; i < right; i++) {
                int j = i+1;
                if(nums[i]>nums[j]){
                    Swap.swap(i, j, nums);
                }

            }
            right--;


            for (int i = right; i > left; i--) {
                int j = i-1;
                if(nums[i]<nums[j]){
                    Swap.swap(i, j, nums);
                }

            }
            left++;

        }

    }


}
