package leetcode41_50;


/**
 * 42. 接雨水
 */
public class $42 {

    public static void main(String[] args) {
        int [] init = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(init);
    }

    /**
     * 动态规划  求共同的阴影面积
     * @param height
     * @return
     */
    public static int trap1(int[] height) {
        int len = height.length;
        if(len==0){
            return 0;
        }
        int[] leftmax = new int[len];
        leftmax[0] = height[0];
        for (int i = 1; i < len; i++) {
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }
        int[] rightmax = new int[len];
        rightmax[len-1] = height[len-1];
        for (int i = len-2; i >=0 ; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }
        int ans = 0;
        for (int i = 0; i < len; ++i) {
            ans += Math.min(leftmax[i], rightmax[i]) - height[i];
        }
        return ans;

    }

    /**
     * 双指针
     * @param height
     * @return
     */
    public static int trap(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                ++left;
            } else {
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }



}
