package array;

public class 长度最小的子数组 {

    public static void main(String[] args) {
        int s = 7;
        int[] nums = new int[]{2,3,1,2,4,3};
        int i = minSubArrayLen(s, nums);
        System.out.println(i);
    }


    public static int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if (len==0){
            return 0;
        }
        // 滑动窗口
        int left = 0,right = -1,sum = 0;
        int minlen = 0;
        while (right < len){
            while (sum < s && right < len){
                sum += nums[++right];
            }
            if (sum >= s){
                if ((right - left + 1) <= minlen){
                    minlen = right - left + 1;
                }
                sum -= nums[left++];
            }
        }
        return minlen < len ? minlen : 0;
    }

}
