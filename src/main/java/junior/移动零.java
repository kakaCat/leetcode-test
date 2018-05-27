package junior;

/**
 * Created by JAVA on 2018/5/27.
 */
public class 移动零 {

    public static void main(String[] args) {
        int[] nums ={0,1,0,3 ,12};

        moveZeroes(nums);

        System.out.println("--");
    }


        public static void moveZeroes(int[] nums) {

            //数组自身指针
            int fast =0 ;
            //去除0的数组指针
            int slow=0;


            int size= nums.length;

            while(fast<size){

                if(nums[fast]!=0){


                    //去除0 后向前移位
                    nums[slow] = nums[fast];

                    slow++;

                }
                fast++;

            }

            for(int i=slow;i<size;i++){
                nums[i] =0;
            }



        }


}
