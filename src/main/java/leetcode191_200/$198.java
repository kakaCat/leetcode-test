package leetcode191_200;

/**
 * @ClassName $198
 * @Description 198. 打家劫舍
 * @Author yunp
 * @Date 2020/7/21 15:04
 * @Version 1.0
 **/
public class $198 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,3,1,4,15,20};


        int rob = rob(nums);

        System.out.println(rob);
    }


    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }



}
