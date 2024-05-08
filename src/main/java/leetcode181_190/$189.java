package leetcode181_190;

public class $189 {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] t = new int[len];
        for(int i = 0;i<len;i++){
            int l = i + i;
            if(l<len){
                t[l] = nums[i];
            }else{
                t[l-len] = nums[i];
            }
        }
        for(int i =0 ;i<len;i++){
            nums[i] = t[i];
        }

    }

}
