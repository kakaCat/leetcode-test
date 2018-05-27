package junior;

/**
 * Created by JAVA on 2018/5/24.
 */
public class 旋转数组 {

    public static void main(String[] args) {

        int[] nums  = {5,6,7,1,2,3,4};


        rotate2(nums,3);


        System.out.println(nums.toString());
    }

    public static void rotate2(int[] nums, int k) {

        int length = nums.length;

        int[] temp = new int[length] ;
        for (int i = 0; i < length; i++) {
            temp[i]=nums[i];
        }

        for (int i = 0; i < length; i++) {

            nums[(i+k)%length]=temp[i];

        }


    }

    public static void rotate(int[] nums, int k) {
        //取模为0则直接返回
        k = k%nums.length;
        if(k==0){
            return;
        }

        //临时空间
        int [] buf = new int[k];
        int length = nums.length;

        //保存移动后的k个数
        for(int i = 0 ;i<k;i++){
            //第一为倒数k位置的数 依次类推 到地k个数
            buf[i] = nums[length-k+i];
        }

        //从后面移动把前面k以后的移动到最后
        for(int i=length-1;i>=k;i--){
            //最后的为k前面的数 ,依次类推
            nums[i]=nums[i-k];
        }

        //整合后数据
        for(int i=0;i<k;i++){
            nums[i]=buf[i];
        }



    }



}
