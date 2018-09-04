package array;

/**
 * Created by JAVA on 2018/8/30.
 */
public class 加一 {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6};

        for (int i : plusOne(nums)) {
            System.out.println(i);
        }

    }

    public static int[] plusOne(int[] digits) {


        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){

                digits[i] = digits[i] + 1;
                return digits;
            }else {
                digits[i] = 0;
            }

        }


        int[] newdigits = new int[digits.length+1];
        newdigits[0] = 1;
        for (int i = 1; i < newdigits.length; i++) {
            newdigits[i] = 0;
        }

        return newdigits;
    }

}
