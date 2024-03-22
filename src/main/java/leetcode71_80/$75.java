package leetcode71_80;

/**
 * @ClassName $75
 * @Description 75. 颜色分类
 * @Author yunp
 * @Date 2020/6/2 14:36
 * @Version 1.0
 **/
public class $75 {

    public static void main(String[] args) {

        int[] arr = new int[]{2,0,1};
        sortColors(arr);
    }


    public static void sortColors(int[] nums) {
        // 对于所有 idx < i : nums[idx < i] = 0
        // j是当前考虑元素的下标
        int p0 = 0, curr = 0;
        // 对于所有 idx > k : nums[idx > k] = 2
        int p2 = nums.length - 1;

        int tmp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                // 交换第 p0个和第curr个元素
                // i++，j++
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            }
            else if (nums[curr] == 2) {
                // 交换第k个和第curr个元素
                // p2--
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            }
            else {
                curr++;
            }
        }
    }

}
