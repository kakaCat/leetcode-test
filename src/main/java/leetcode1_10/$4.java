package leetcode1_10;

public class $4 {


    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = findMedianSortedArrays2(nums1, nums2);
        System.out.println(median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        //移位
        if (m > n) { // to ensure m<=n
            int[] temp = nums1; nums1 = nums2; nums2 = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;

        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            System.out.println("i:{"+i+"}  j:{"+j+"}");
            if (i < iMax && nums2[j-1] > nums1[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && nums1[i-1] > nums2[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = nums2[j-1]; }
                else if (j == 0) { maxLeft = nums1[i-1]; }
                else { maxLeft = Math.max(nums1[i-1], nums2[j-1]); }



                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = nums2[j]; }
                else if (j == n) { minRight = nums1[i]; }
                else { minRight = Math.min(nums2[j], nums1[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }


    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int max = nums1.length+nums2.length;
        int midIndex=0;

        boolean oddFlag=false;
        midIndex= max/2;
        if(max%2==1){
            oddFlag=true;
        }
        int[] all=new int[midIndex+1];
        int p1=0;
        int p2=0;
        for(int i=0;i<=midIndex;i++){
            if(p1>nums1.length-1){
                all[i]=nums2[p2];
                p2++;
                continue;
            }

            if(p2>nums2.length-1){
                all[i]=nums1[p1];
                p1++;
                continue;
            }
            if(nums1[p1]<nums2[p2]){
                all[i]=nums1[p1];
                p1++;
            }else {
                all[i]=nums2[p2];
                p2++;
            }



        }
        if(oddFlag){
            return (double) all[all.length-1];
        }
        double avg=0.0d;
        avg=((double) (all[all.length-2]+all[all.length-1]))/2;
        return avg;
    }


}
