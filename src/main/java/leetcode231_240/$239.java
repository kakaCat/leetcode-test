package leetcode231_240;

public class $239 {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        final int[] ints = maxSlidingWindow(nums, 3);
        System.out.println(ints);

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int r = k-1;
        int[] ans = new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            ans[i] = getMax(nums,i,r++);
        }
        return ans;
    }

    public static int getMax(int[] nums,int l,int r){
        int max = Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            max = Math.max(nums[i],max);
        }
        return max;
    }
}
