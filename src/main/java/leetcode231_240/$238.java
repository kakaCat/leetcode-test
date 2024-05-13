package leetcode231_240;

public class $238 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i = 0 ;i<nums.length;i++){
            int t = 1;
            for(int j =0;j<nums.length;j++){
                if(j==i){
                    continue;
                }
                t *= nums[j];
            }
            ans[i] = t;
        }
        return ans;
    }
}
