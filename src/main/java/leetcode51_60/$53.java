package leetcode51_60;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName $53
 * @Description 53. 最大子序和
 * @Author yunp
 * @Date 2020/6/2 10:27
 * @Version 1.0
 **/
public class $53 {

    public static void main(String[] args) {
        String s = null;

        Set<Integer> set = new HashSet<>();
//        set.contains();
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray2(arr);
        System.out.println(i);
    }

    //总数为负，从新开始头节点
    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int now = nums[0];
        for (int i = 1; i < nums.length ;i++) {
            now = Math.max(nums[i], now + nums[i]);
            max = Math.max(max, now);
        }
        return max;
    }

    public static int maxSubArray2(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];

        for(int i=1; i<len; i++){
            if(dp[i-1]>0){
                dp[i] = dp[i-1]+nums[i];
            }else{
                dp[i] = nums[i];
            }
        }
        int max = dp[0];
        for(int i = 1;i<len;i++){
            max = Math.max(max,dp[i]);
        }
        return max;
    }

}
