package junior;

/**
 * Created by JAVA on 2018/5/30.
 */
public class 合并两个有序数组 {

    public static void main(String[] args) {
//        int[] nuns1 ={1,2,3,0,0,0};
//        int[] nuns2 ={2,5,6};

        int[] nuns1 ={2,0};
        int[] nuns2 ={1};

        merge(nuns1,1,nuns2,1);

        System.out.println("--");

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m==0){
            for(int i=0;i<n;i++){

                nums1[i]=nums2[i];
            }

            return ;
        }

        //数组1的指针
        int i =m-1;
        //数组2的指针
        int j =n-1;
        //数组合计的指针
        int indexnums1 = m+n-1;

        while(i>=0&&j>=0){

            nums1[indexnums1--] = nums1[i]>=nums2[j]?nums1[i--]:nums2[j--];

        }

        while(j>=0){
            nums1[indexnums1--] = nums2[j--];
        }



    }

}
