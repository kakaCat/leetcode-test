package sort.bubble;

import sort.utils.Swap;

/**
 * Created by JAVA on 2018/8/27.
 */
public class 冒泡 {

    public static void main(String[] args) {
        int[] nums = Swap.initNums;
        bubbleSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }
    
    public static void bubbleSort(int... nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){

                if(nums[i]>nums[j]){
                    Swap.swap(i,j,nums);
                }

            }
        }
        
        
    }
    







}
