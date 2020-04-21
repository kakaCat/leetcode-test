package leetcode31_40;

/**
 * @ClassName $35
 * @Description 搜索插入位置
 * @Author yunp
 * @Date 2020/4/14 17:10
 * @Version 1.0
 **/
public class $35 {


    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int i = searchInsert(nums, target);
    }

    public static int searchInsert(int[] nums, int target) {
        int len =  nums.length;
        if(len == 0){
            return 0;
        }


        for (int i = 0; i <len ; i++) {
            if(target == nums[i]){
                return i;
            }else if(target<nums[i]){
                return i;
            }
        }
        return len+1;
    }

}
