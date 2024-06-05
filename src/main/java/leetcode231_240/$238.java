package leetcode231_240;

import java.util.ArrayDeque;

public class $238 {

    public static void main(String[] args) {
        int[] nums = {0,2,3,1};
        productExceptSelf2(nums);
//        final ArrayDeque arrayDeque = new ArrayDeque();
//        arrayDeque.peek()
    }
    public static int[] productExceptSelf2(int[] nums) {
        int len = nums.length;
        int[] l = new int[len];
        int[] r = new int[len];
        l[0] = 1;
        for(int i =1 ;i<len ;i++){
            l[i] = l[i-1] * nums[i-1];
        }
        r[len-1] = 1;
        for(int i=len-2;i>=0;i--){
            r[i] = r[i+1] * nums[i+1];
        }
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            ans[i] = l[i]* r[i];
        }

        return ans;
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
