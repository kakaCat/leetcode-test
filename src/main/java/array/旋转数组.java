package array;

/**
 * Created by JAVA on 2018/8/30.
 */
public class 旋转数组 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        for (int i = 0; i < rotate(nums, 3).length; i++) {
            System.out.println(rotate(nums, 3)[i]);
        }

    }

    public static int[] rotate(int[] nums, int k) {
        if(nums.length==0||(k%=nums.length)==0){
            return nums;
        }
        int n = nums.length, start = 0, index = 0, cur = nums[index], count = 0;
        while (count++<n){
            index = (index + k) % n;
            int t = nums[index];
            nums[index] = cur;
            if (index == start) {
                ++start;
                ++index;
                cur = nums[index];
            }else {
                cur = t;
            }
        }
        return nums;
    }

}
