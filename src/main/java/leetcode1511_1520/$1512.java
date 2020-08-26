package leetcode1511_1520;

/**
 * @ClassName $1512
 * @Description 1512. 好数对的数目
 * @Author yunp
 * @Date 2020/7/16 18:02
 * @Version 1.0
 **/
public class $1512 {


    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,1,1,3};

        int i = numIdenticalPairs(nums);

        System.out.println(i);

    }



    public static int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        int ans = 0;
        for(int num : nums){
            temp[num]++;
            ans+=temp[num]-1;
        }
        return ans;
    }



}
