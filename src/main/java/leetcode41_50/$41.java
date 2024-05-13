package leetcode41_50;

import java.util.Arrays;

public class $41 {

    public static void main(String[] args) {
       int[] nums ={1,2,0};

        final int i = firstMissingPositive(nums);
        System.out.println(i);
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        for(int i=1;i<=nums.length;i++){
            if(i>=nums.length){
                return i;
            }
            if(index<nums.length && i<nums[index]){
                return i;
            }
            while(index<nums.length && i>=nums[index]){
                index++;
            }
        }
        return nums.length+1;
    }
}
