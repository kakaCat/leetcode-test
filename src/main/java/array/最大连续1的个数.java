package array;

public class 最大连续1的个数 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,1,1,1};

        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        if(length <0){
            return 0;
        }

        int count = 0,max = 0;

        for(int i = 0;i<length;i++){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max = count;
                }
            }else {
                count = 0;
            }
        }
        return max;
    }


}
